package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberColumn extends StObject {
  
  // How many decimal places to display. See below for information about the possible values.
  var decimalPlaces: js.UndefOr[NullableOption[String]] = js.native
  
  // How the value should be presented in the UX. Must be one of number or percentage. If unspecified, treated as number.
  var displayAs: js.UndefOr[NullableOption[String]] = js.native
  
  // The maximum permitted value.
  var maximum: js.UndefOr[NullableOption[Double]] = js.native
  
  // The minimum permitted value.
  var minimum: js.UndefOr[NullableOption[Double]] = js.native
}
object NumberColumn {
  
  @scala.inline
  def apply(): NumberColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberColumn]
  }
  
  @scala.inline
  implicit class NumberColumnMutableBuilder[Self <: NumberColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecimalPlaces(value: NullableOption[String]): Self = StObject.set(x, "decimalPlaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimalPlacesNull: Self = StObject.set(x, "decimalPlaces", null)
    
    @scala.inline
    def setDecimalPlacesUndefined: Self = StObject.set(x, "decimalPlaces", js.undefined)
    
    @scala.inline
    def setDisplayAs(value: NullableOption[String]): Self = StObject.set(x, "displayAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayAsNull: Self = StObject.set(x, "displayAs", null)
    
    @scala.inline
    def setDisplayAsUndefined: Self = StObject.set(x, "displayAs", js.undefined)
    
    @scala.inline
    def setMaximum(value: NullableOption[Double]): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumNull: Self = StObject.set(x, "maximum", null)
    
    @scala.inline
    def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    
    @scala.inline
    def setMinimum(value: NullableOption[Double]): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumNull: Self = StObject.set(x, "minimum", null)
    
    @scala.inline
    def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
  }
}
