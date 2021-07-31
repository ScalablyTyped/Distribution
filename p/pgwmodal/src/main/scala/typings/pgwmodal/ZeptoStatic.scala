package typings.pgwmodal

import typings.pgwmodal.pgwmodalStrings.close
import typings.pgwmodal.pgwmodalStrings.getData
import typings.pgwmodal.pgwmodalStrings.isOpen
import typings.pgwmodal.pgwmodalStrings.reposition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZeptoStatic extends StObject {
  
  def pgwModal(action: String): js.Any
  def pgwModal(option: PgwModalOption): Boolean
  @JSName("pgwModal")
  var pgwModal_Original: PgwModalMethod
  @JSName("pgwModal")
  def pgwModal_close(action: close): Boolean
  @JSName("pgwModal")
  def pgwModal_getData(action: getData): js.Any
  @JSName("pgwModal")
  def pgwModal_isOpen(action: isOpen): Boolean
  @JSName("pgwModal")
  def pgwModal_reposition(action: reposition): Boolean
}
object ZeptoStatic {
  
  @scala.inline
  def apply(pgwModal: PgwModalMethod): ZeptoStatic = {
    val __obj = js.Dynamic.literal(pgwModal = pgwModal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZeptoStatic]
  }
  
  @scala.inline
  implicit class ZeptoStaticMutableBuilder[Self <: ZeptoStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPgwModal(value: PgwModalMethod): Self = StObject.set(x, "pgwModal", value.asInstanceOf[js.Any])
  }
}
