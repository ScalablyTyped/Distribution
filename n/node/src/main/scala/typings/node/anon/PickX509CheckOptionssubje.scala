package typings.node.anon

import typings.node.nodeStrings.always
import typings.node.nodeStrings.default
import typings.node.nodeStrings.never
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<node.crypto.X509CheckOptions, 'subject'> */
trait PickX509CheckOptionssubje extends StObject {
  
  var subject: js.UndefOr[always | default | never] = js.undefined
}
object PickX509CheckOptionssubje {
  
  inline def apply(): PickX509CheckOptionssubje = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickX509CheckOptionssubje]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickX509CheckOptionssubje] (val x: Self) extends AnyVal {
    
    inline def setSubject(value: always | default | never): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
  }
}
