package typings.openrct2.mod.global

import typings.openrct2.anon.CompanyValue
import typings.openrct2.openrct2Strings.beginner
import typings.openrct2.openrct2Strings.build_your_own
import typings.openrct2.openrct2Strings.challenging
import typings.openrct2.openrct2Strings.dlc
import typings.openrct2.openrct2Strings.expert
import typings.openrct2.openrct2Strings.other
import typings.openrct2.openrct2Strings.rct1
import typings.openrct2.openrct2Strings.rct1_aa
import typings.openrct2.openrct2Strings.rct1_ll
import typings.openrct2.openrct2Strings.rct2
import typings.openrct2.openrct2Strings.rct2_tt
import typings.openrct2.openrct2Strings.rct2_ww
import typings.openrct2.openrct2Strings.real
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an installed scenario's path and metadata.
  */
trait ScenarioFile extends StObject {
  
  var category: beginner | challenging | expert | real | other | dlc | build_your_own
  
  var details: String
  
  var highscore: CompanyValue
  
  var id: Double
  
  var internalName: String
  
  var name: String
  
  var path: String
  
  var sourceGame: rct1 | rct1_aa | rct1_ll | rct2 | rct2_ww | rct2_tt | real | other
}
object ScenarioFile {
  
  inline def apply(
    category: beginner | challenging | expert | real | other | dlc | build_your_own,
    details: String,
    highscore: CompanyValue,
    id: Double,
    internalName: String,
    name: String,
    path: String,
    sourceGame: rct1 | rct1_aa | rct1_ll | rct2 | rct2_ww | rct2_tt | real | other
  ): ScenarioFile = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], highscore = highscore.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], internalName = internalName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sourceGame = sourceGame.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScenarioFile]
  }
  
  extension [Self <: ScenarioFile](x: Self) {
    
    inline def setCategory(value: beginner | challenging | expert | real | other | dlc | build_your_own): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setHighscore(value: CompanyValue): Self = StObject.set(x, "highscore", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInternalName(value: String): Self = StObject.set(x, "internalName", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSourceGame(value: rct1 | rct1_aa | rct1_ll | rct2 | rct2_ww | rct2_tt | real | other): Self = StObject.set(x, "sourceGame", value.asInstanceOf[js.Any])
  }
}
