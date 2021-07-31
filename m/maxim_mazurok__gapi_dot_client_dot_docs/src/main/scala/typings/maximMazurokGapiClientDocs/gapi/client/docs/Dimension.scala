package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dimension extends StObject {
  
  /** The magnitude. */
  var magnitude: js.UndefOr[Double] = js.undefined
  
  /** The units for magnitude. */
  var unit: js.UndefOr[String] = js.undefined
}
object Dimension {
  
  @scala.inline
  def apply(): Dimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dimension]
  }
  
  @scala.inline
  implicit class DimensionMutableBuilder[Self <: Dimension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMagnitude(value: Double): Self = StObject.set(x, "magnitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagnitudeUndefined: Self = StObject.set(x, "magnitude", js.undefined)
    
    @scala.inline
    def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
