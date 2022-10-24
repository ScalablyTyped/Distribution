package typings.nivoGenerators

import typings.nivoGenerators.anon.CategoryCount
import typings.nivoGenerators.anon.Color
import typings.nivoGenerators.anon.Country
import typings.nivoGenerators.anon.Data
import typings.nivoGenerators.anon.DataGroups
import typings.nivoGenerators.anon.DataId
import typings.nivoGenerators.anon.DataKeys
import typings.nivoGenerators.anon.Day
import typings.nivoGenerators.anon.Groups
import typings.nivoGenerators.anon.Id
import typings.nivoGenerators.anon.Keys
import typings.nivoGenerators.anon.Label
import typings.nivoGenerators.anon.LeafSize
import typings.nivoGenerators.anon.Links
import typings.nivoGenerators.anon.Matrix
import typings.nivoGenerators.anon.Max
import typings.nivoGenerators.anon.MaxIterations
import typings.nivoGenerators.anon.Nodes
import typings.nivoGenerators.anon.RandMax
import typings.nivoGenerators.anon.SerieIds
import typings.nivoGenerators.anon.Y
import typings.nivoGenerators.distTypesBulletMod.Options
import typings.std.Record
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@nivo/generators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateBulletData(id: String, max: Double): Id = (^.asInstanceOf[js.Dynamic].applyDynamic("generateBulletData")(id.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Id]
  inline def generateBulletData(id: String, max: Double, param2: Options): Id = (^.asInstanceOf[js.Dynamic].applyDynamic("generateBulletData")(id.asInstanceOf[js.Any], max.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[Id]
  
  inline def generateChordData(): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("generateChordData")().asInstanceOf[Matrix]
  inline def generateChordData(param0: Keys): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("generateChordData")(param0.asInstanceOf[js.Any]).asInstanceOf[Matrix]
  
  inline def generateCountriesData(keys: js.Array[String]): js.Array[Record[String, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateCountriesData")(keys.asInstanceOf[js.Any]).asInstanceOf[js.Array[Record[String, Any]]]
  inline def generateCountriesData(keys: js.Array[String], param1: Max): js.Array[Record[String, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCountriesData")(keys.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Array[Record[String, Any]]]
  
  inline def generateCountriesPopulation(size: Double): js.Array[Country] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateCountriesPopulation")(size.asInstanceOf[js.Any]).asInstanceOf[js.Array[Country]]
  
  inline def generateDayCounts(from: js.Date, to: js.Date): js.Array[Day] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateDayCounts")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Array[Day]]
  inline def generateDayCounts(from: js.Date, to: js.Date, maxSize: Double): js.Array[Day] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateDayCounts")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], maxSize.asInstanceOf[js.Any])).asInstanceOf[js.Array[Day]]
  
  inline def generateDrinkStats(): js.Array[DrinkDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateDrinkStats")().asInstanceOf[js.Array[DrinkDatum]]
  inline def generateDrinkStats(xSize: Double): js.Array[DrinkDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateDrinkStats")(xSize.asInstanceOf[js.Any]).asInstanceOf[js.Array[DrinkDatum]]
  
  inline def generateLibTree(): LibTreeDatum = ^.asInstanceOf[js.Dynamic].applyDynamic("generateLibTree")().asInstanceOf[LibTreeDatum]
  inline def generateLibTree(name: String): LibTreeDatum = ^.asInstanceOf[js.Dynamic].applyDynamic("generateLibTree")(name.asInstanceOf[js.Any]).asInstanceOf[LibTreeDatum]
  inline def generateLibTree(name: String, limit: Double): LibTreeDatum = (^.asInstanceOf[js.Dynamic].applyDynamic("generateLibTree")(name.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[LibTreeDatum]
  inline def generateLibTree(
    name: String,
    limit: Double,
    children: js.Array[
      js.Array[
        String | (js.Array[
          js.Array[
            String | (js.Array[js.Array[String | (js.Array[js.Array[String | js.Array[js.Array[String]]]])]])
          ]
        ])
      ]
    ]
  ): LibTreeDatum = (^.asInstanceOf[js.Dynamic].applyDynamic("generateLibTree")(name.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[LibTreeDatum]
  inline def generateLibTree(
    name: String,
    limit: Null,
    children: js.Array[
      js.Array[
        String | (js.Array[
          js.Array[
            String | (js.Array[js.Array[String | (js.Array[js.Array[String | js.Array[js.Array[String]]]])]])
          ]
        ])
      ]
    ]
  ): LibTreeDatum = (^.asInstanceOf[js.Dynamic].applyDynamic("generateLibTree")(name.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[LibTreeDatum]
  inline def generateLibTree(
    name: String,
    limit: Unit,
    children: js.Array[
      js.Array[
        String | (js.Array[
          js.Array[
            String | (js.Array[js.Array[String | (js.Array[js.Array[String | js.Array[js.Array[String]]]])]])
          ]
        ])
      ]
    ]
  ): LibTreeDatum = (^.asInstanceOf[js.Dynamic].applyDynamic("generateLibTree")(name.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[LibTreeDatum]
  inline def generateLibTree(name: Unit, limit: Double): LibTreeDatum = (^.asInstanceOf[js.Dynamic].applyDynamic("generateLibTree")(name.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[LibTreeDatum]
  inline def generateLibTree(
    name: Unit,
    limit: Double,
    children: js.Array[
      js.Array[
        String | (js.Array[
          js.Array[
            String | (js.Array[js.Array[String | (js.Array[js.Array[String | js.Array[js.Array[String]]]])]])
          ]
        ])
      ]
    ]
  ): LibTreeDatum = (^.asInstanceOf[js.Dynamic].applyDynamic("generateLibTree")(name.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[LibTreeDatum]
  inline def generateLibTree(
    name: Unit,
    limit: Null,
    children: js.Array[
      js.Array[
        String | (js.Array[
          js.Array[
            String | (js.Array[js.Array[String | (js.Array[js.Array[String | js.Array[js.Array[String]]]])]])
          ]
        ])
      ]
    ]
  ): LibTreeDatum = (^.asInstanceOf[js.Dynamic].applyDynamic("generateLibTree")(name.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[LibTreeDatum]
  inline def generateLibTree(
    name: Unit,
    limit: Unit,
    children: js.Array[
      js.Array[
        String | (js.Array[
          js.Array[
            String | (js.Array[js.Array[String | (js.Array[js.Array[String | js.Array[js.Array[String]]]])]])
          ]
        ])
      ]
    ]
  ): LibTreeDatum = (^.asInstanceOf[js.Dynamic].applyDynamic("generateLibTree")(name.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[LibTreeDatum]
  
  inline def generateNetworkData(): Links = ^.asInstanceOf[js.Dynamic].applyDynamic("generateNetworkData")().asInstanceOf[Links]
  inline def generateNetworkData(param0: LeafSize): Links = ^.asInstanceOf[js.Dynamic].applyDynamic("generateNetworkData")(param0.asInstanceOf[js.Any]).asInstanceOf[Links]
  
  inline def generateOrderedDayCounts(from: js.Date, to: js.Date): js.Array[Day] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateOrderedDayCounts")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Array[Day]]
  
  inline def generateParallelCoordinatesData(): js.Array[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateParallelCoordinatesData")().asInstanceOf[js.Array[js.Object]]
  inline def generateParallelCoordinatesData(param0: typings.nivoGenerators.distTypesParallelCoordinatesMod.Options): js.Array[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateParallelCoordinatesData")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Object]]
  
  inline def generateProgrammingLanguageStats(): js.Array[Label] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateProgrammingLanguageStats")().asInstanceOf[js.Array[Label]]
  inline def generateProgrammingLanguageStats(shouldShuffle: Boolean): js.Array[Label] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateProgrammingLanguageStats")(shouldShuffle.asInstanceOf[js.Any]).asInstanceOf[js.Array[Label]]
  inline def generateProgrammingLanguageStats(shouldShuffle: Boolean, limit: Double): js.Array[Label] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateProgrammingLanguageStats")(shouldShuffle.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[Label]]
  inline def generateProgrammingLanguageStats(shouldShuffle: Unit, limit: Double): js.Array[Label] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateProgrammingLanguageStats")(shouldShuffle.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[Label]]
  
  inline def generateSankeyData(): Nodes = ^.asInstanceOf[js.Dynamic].applyDynamic("generateSankeyData")().asInstanceOf[Nodes]
  inline def generateSankeyData(param0: MaxIterations): Nodes = ^.asInstanceOf[js.Dynamic].applyDynamic("generateSankeyData")(param0.asInstanceOf[js.Any]).asInstanceOf[Nodes]
  
  inline def generateSerie(): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateSerie")().asInstanceOf[js.Array[Double]]
  inline def generateSerie(xSize: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateSerie")(xSize.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def generateSeries(ids: js.Array[String], xKeys: js.Array[String]): js.Array[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSeries")(ids.asInstanceOf[js.Any], xKeys.asInstanceOf[js.Any])).asInstanceOf[js.Array[Data]]
  
  inline def generateStackData(): js.Array[js.Array[Y]] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateStackData")().asInstanceOf[js.Array[js.Array[Y]]]
  inline def generateStackData(size: Double): js.Array[js.Array[Y]] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateStackData")(size.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[Y]]]
  
  inline def generateSwarmPlotData(groups: js.Array[String], param1: CategoryCount): Groups = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSwarmPlotData")(groups.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Groups]
  
  inline def generateWinesTastes(): DataKeys = ^.asInstanceOf[js.Dynamic].applyDynamic("generateWinesTastes")().asInstanceOf[DataKeys]
  inline def generateWinesTastes(param0: RandMax): DataKeys = ^.asInstanceOf[js.Dynamic].applyDynamic("generateWinesTastes")(param0.asInstanceOf[js.Any]).asInstanceOf[DataKeys]
  
  inline def generateXYSeries(param0: SerieIds): js.Array[DataId] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateXYSeries")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[DataId]]
  
  inline def randColor(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randColor")().asInstanceOf[String]
  
  inline def randCountryCode(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randCountryCode")().asInstanceOf[String]
  
  inline def randomizeSwarmPlotData(
    previousData: ReturnType[js.Function2[/* groups */ js.Array[String], /* param1 */ CategoryCount, Groups]]
  ): DataGroups = ^.asInstanceOf[js.Dynamic].applyDynamic("randomizeSwarmPlotData")(previousData.asInstanceOf[js.Any]).asInstanceOf[DataGroups]
  
  object sets {
    
    @JSImport("@nivo/generators", "sets.countryCodes")
    @js.native
    val countryCodes: js.Array[String] = js.native
    
    @JSImport("@nivo/generators", "sets.names")
    @js.native
    val names: js.Array[String] = js.native
    
    @JSImport("@nivo/generators", "sets.programmingLanguages")
    @js.native
    val programmingLanguages: js.Array[String] = js.native
  }
  
  inline def uniqRand[T](generator: js.Function1[/* repeated */ Any, T]): js.Function1[/* repeated */ Any, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("uniqRand")(generator.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ Any, T]]
  
  trait DrinkDatum extends StObject {
    
    var color: String
    
    var data: js.Array[Color]
    
    var id: String
  }
  object DrinkDatum {
    
    inline def apply(color: String, data: js.Array[Color], id: String): DrinkDatum = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrinkDatum]
    }
    
    extension [Self <: DrinkDatum](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Array[Color]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Color*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait LibTreeDatum extends StObject {
    
    var children: js.UndefOr[js.Array[LibTreeDatum]] = js.undefined
    
    var color: String
    
    var loc: js.UndefOr[Double] = js.undefined
    
    var name: String
  }
  object LibTreeDatum {
    
    inline def apply(color: String, name: String): LibTreeDatum = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[LibTreeDatum]
    }
    
    extension [Self <: LibTreeDatum](x: Self) {
      
      inline def setChildren(value: js.Array[LibTreeDatum]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: LibTreeDatum*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setLoc(value: Double): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
      
      inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
