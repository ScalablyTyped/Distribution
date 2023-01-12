package typings.openui5.anon

import typings.openui5.sapUiUx3LibraryMod.NotificationBarStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Status extends StObject {
  
  /**
    * The corresponding status to which the bar was resized. The corresponding heights can be taken for the
    * bar's CSS file.
    */
  var status: js.UndefOr[
    NotificationBarStatus | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof NotificationBarStatus * / any */ String)
  ] = js.undefined
}
object Status {
  
  inline def apply(): Status = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Status]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Status] (val x: Self) extends AnyVal {
    
    inline def setStatus(
      value: NotificationBarStatus | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof NotificationBarStatus * / any */ String)
    ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
