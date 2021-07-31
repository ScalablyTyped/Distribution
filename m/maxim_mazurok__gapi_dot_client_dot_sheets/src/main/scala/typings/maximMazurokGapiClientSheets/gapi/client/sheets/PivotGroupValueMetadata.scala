package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotGroupValueMetadata extends StObject {
  
  /** True if the data corresponding to the value is collapsed. */
  var collapsed: js.UndefOr[Boolean] = js.undefined
  
  /** The calculated value the metadata corresponds to. (Note that formulaValue is not valid, because the values will be calculated.) */
  var value: js.UndefOr[ExtendedValue] = js.undefined
}
object PivotGroupValueMetadata {
  
  @scala.inline
  def apply(): PivotGroupValueMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotGroupValueMetadata]
  }
  
  @scala.inline
  implicit class PivotGroupValueMetadataMutableBuilder[Self <: PivotGroupValueMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    
    @scala.inline
    def setValue(value: ExtendedValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
