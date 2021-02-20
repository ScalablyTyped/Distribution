package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICLSIDs extends StObject {
  
  val PreviewerCtrl: String = js.native
  
  val ShellListingCtrl: String = js.native
}
object ICLSIDs {
  
  @scala.inline
  def apply(PreviewerCtrl: String, ShellListingCtrl: String): ICLSIDs = {
    val __obj = js.Dynamic.literal(PreviewerCtrl = PreviewerCtrl.asInstanceOf[js.Any], ShellListingCtrl = ShellListingCtrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICLSIDs]
  }
  
  @scala.inline
  implicit class ICLSIDsMutableBuilder[Self <: ICLSIDs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreviewerCtrl(value: String): Self = StObject.set(x, "PreviewerCtrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShellListingCtrl(value: String): Self = StObject.set(x, "ShellListingCtrl", value.asInstanceOf[js.Any])
  }
}
