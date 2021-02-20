package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultRootLabel extends StObject {
  
  var defaultRootLabel: js.UndefOr[String] = js.native
  
  var hierMenuBtnLabel: js.UndefOr[String] = js.native
  
  var previousIcon: js.UndefOr[String] = js.native
}
object DefaultRootLabel {
  
  @scala.inline
  def apply(): DefaultRootLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultRootLabel]
  }
  
  @scala.inline
  implicit class DefaultRootLabelMutableBuilder[Self <: DefaultRootLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultRootLabel(value: String): Self = StObject.set(x, "defaultRootLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRootLabelUndefined: Self = StObject.set(x, "defaultRootLabel", js.undefined)
    
    @scala.inline
    def setHierMenuBtnLabel(value: String): Self = StObject.set(x, "hierMenuBtnLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHierMenuBtnLabelUndefined: Self = StObject.set(x, "hierMenuBtnLabel", js.undefined)
    
    @scala.inline
    def setPreviousIcon(value: String): Self = StObject.set(x, "previousIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousIconUndefined: Self = StObject.set(x, "previousIcon", js.undefined)
  }
}
