package typings.nivoChord.anon

import typings.d3Chord.mod.ChordLayout
import typings.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Chord extends StObject {
  
  var chord: ChordLayout
  
  var data: js.Array[js.Array[Double]]
  
  def formatValue(value: Double): String
  
  var getColor: OrdinalColorScale[OmitArcDatumlabelcolor]
  
  def getLabel(arc: OmitArcDatumlabelcolor): String
  
  var keys: js.Array[String]
}
object Chord {
  
  inline def apply(
    chord: ChordLayout,
    data: js.Array[js.Array[Double]],
    formatValue: Double => String,
    getColor: OmitArcDatumlabelcolor => String,
    getLabel: OmitArcDatumlabelcolor => String,
    keys: js.Array[String]
  ): Chord = {
    val __obj = js.Dynamic.literal(chord = chord.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], formatValue = js.Any.fromFunction1(formatValue), getColor = js.Any.fromFunction1(getColor), getLabel = js.Any.fromFunction1(getLabel), keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Chord] (val x: Self) extends AnyVal {
    
    inline def setChord(value: ChordLayout): Self = StObject.set(x, "chord", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: js.Array[Double]*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setFormatValue(value: Double => String): Self = StObject.set(x, "formatValue", js.Any.fromFunction1(value))
    
    inline def setGetColor(value: OmitArcDatumlabelcolor => String): Self = StObject.set(x, "getColor", js.Any.fromFunction1(value))
    
    inline def setGetLabel(value: OmitArcDatumlabelcolor => String): Self = StObject.set(x, "getLabel", js.Any.fromFunction1(value))
    
    inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
  }
}
