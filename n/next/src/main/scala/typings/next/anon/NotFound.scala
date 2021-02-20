package typings.next.anon

import typings.next.mod.GetServerSidePropsResult
import typings.next.mod.GetStaticPropsResult
import typings.next.nextBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotFound
  extends GetServerSidePropsResult[js.Any]
     with GetStaticPropsResult[js.Any] {
  
  var notFound: `true` = js.native
}
object NotFound {
  
  @scala.inline
  def apply(notFound: `true`): NotFound = {
    val __obj = js.Dynamic.literal(notFound = notFound.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotFound]
  }
  
  @scala.inline
  implicit class NotFoundMutableBuilder[Self <: NotFound] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotFound(value: `true`): Self = StObject.set(x, "notFound", value.asInstanceOf[js.Any])
  }
}
