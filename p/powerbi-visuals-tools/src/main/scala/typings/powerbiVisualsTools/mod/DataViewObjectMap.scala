package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type DataViewObjectMap = {[id: string] : powerbi-visuals-tools.powerbi-visuals-tools.DataViewObject}
}}}
to avoid circular code involving: 
- powerbi-visuals-tools.powerbi-visuals-tools.DataViewObject
- powerbi-visuals-tools.powerbi-visuals-tools.DataViewObjectMap
- powerbi-visuals-tools.powerbi-visuals-tools.DataViewObjects
*/
trait DataViewObjectMap
  extends StObject
     with /* id */ StringDictionary[DataViewObject]
object DataViewObjectMap {
  
  inline def apply(): DataViewObjectMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataViewObjectMap]
  }
}
