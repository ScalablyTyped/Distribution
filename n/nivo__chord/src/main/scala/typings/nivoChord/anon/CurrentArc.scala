package typings.nivoChord.anon

import typings.nivoChord.typesMod.ArcDatum
import typings.nivoChord.typesMod.RibbonDatum
import typings.react.mod.Dispatch
import typings.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentArc extends StObject {
  
  var currentArc: ArcDatum | Null
  
  var currentRibbon: RibbonDatum | Null
  
  def getArcOpacity(arc: ArcDatum): Double
  
  def getRibbonOpacity(ribbon: RibbonDatum): Double
  
  var hasSelection: Boolean
  
  var selectedArcIds: js.Array[String]
  
  var selectedRibbonIds: js.Array[String]
  
  var setCurrentArc: Dispatch[SetStateAction[ArcDatum | Null]]
  
  var setCurrentRibbon: Dispatch[SetStateAction[RibbonDatum | Null]]
}
object CurrentArc {
  
  inline def apply(
    getArcOpacity: ArcDatum => Double,
    getRibbonOpacity: RibbonDatum => Double,
    hasSelection: Boolean,
    selectedArcIds: js.Array[String],
    selectedRibbonIds: js.Array[String],
    setCurrentArc: SetStateAction[ArcDatum | Null] => Unit,
    setCurrentRibbon: SetStateAction[RibbonDatum | Null] => Unit
  ): CurrentArc = {
    val __obj = js.Dynamic.literal(getArcOpacity = js.Any.fromFunction1(getArcOpacity), getRibbonOpacity = js.Any.fromFunction1(getRibbonOpacity), hasSelection = hasSelection.asInstanceOf[js.Any], selectedArcIds = selectedArcIds.asInstanceOf[js.Any], selectedRibbonIds = selectedRibbonIds.asInstanceOf[js.Any], setCurrentArc = js.Any.fromFunction1(setCurrentArc), setCurrentRibbon = js.Any.fromFunction1(setCurrentRibbon), currentArc = null, currentRibbon = null)
    __obj.asInstanceOf[CurrentArc]
  }
  
  extension [Self <: CurrentArc](x: Self) {
    
    inline def setCurrentArc(value: ArcDatum): Self = StObject.set(x, "currentArc", value.asInstanceOf[js.Any])
    
    inline def setCurrentArcNull: Self = StObject.set(x, "currentArc", null)
    
    inline def setCurrentRibbon(value: RibbonDatum): Self = StObject.set(x, "currentRibbon", value.asInstanceOf[js.Any])
    
    inline def setCurrentRibbonNull: Self = StObject.set(x, "currentRibbon", null)
    
    inline def setGetArcOpacity(value: ArcDatum => Double): Self = StObject.set(x, "getArcOpacity", js.Any.fromFunction1(value))
    
    inline def setGetRibbonOpacity(value: RibbonDatum => Double): Self = StObject.set(x, "getRibbonOpacity", js.Any.fromFunction1(value))
    
    inline def setHasSelection(value: Boolean): Self = StObject.set(x, "hasSelection", value.asInstanceOf[js.Any])
    
    inline def setSelectedArcIds(value: js.Array[String]): Self = StObject.set(x, "selectedArcIds", value.asInstanceOf[js.Any])
    
    inline def setSelectedArcIdsVarargs(value: String*): Self = StObject.set(x, "selectedArcIds", js.Array(value*))
    
    inline def setSelectedRibbonIds(value: js.Array[String]): Self = StObject.set(x, "selectedRibbonIds", value.asInstanceOf[js.Any])
    
    inline def setSelectedRibbonIdsVarargs(value: String*): Self = StObject.set(x, "selectedRibbonIds", js.Array(value*))
    
    inline def setSetCurrentArc(value: SetStateAction[ArcDatum | Null] => Unit): Self = StObject.set(x, "setCurrentArc", js.Any.fromFunction1(value))
    
    inline def setSetCurrentRibbon(value: SetStateAction[RibbonDatum | Null] => Unit): Self = StObject.set(x, "setCurrentRibbon", js.Any.fromFunction1(value))
  }
}
