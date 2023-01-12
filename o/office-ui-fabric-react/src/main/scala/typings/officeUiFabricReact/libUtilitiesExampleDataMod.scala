package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsGroupedListGroupedListDottypesMod.IGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilitiesExampleDataMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/exampleData", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createGroups(groupCount: Double, groupDepth: Double, startIndex: Double, itemsPerGroup: Double): js.Array[IGroup] = (^.asInstanceOf[js.Dynamic].applyDynamic("createGroups")(groupCount.asInstanceOf[js.Any], groupDepth.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], itemsPerGroup.asInstanceOf[js.Any])).asInstanceOf[js.Array[IGroup]]
  inline def createGroups(groupCount: Double, groupDepth: Double, startIndex: Double, itemsPerGroup: Double, level: Double): js.Array[IGroup] = (^.asInstanceOf[js.Dynamic].applyDynamic("createGroups")(groupCount.asInstanceOf[js.Any], groupDepth.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], itemsPerGroup.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[js.Array[IGroup]]
  inline def createGroups(
    groupCount: Double,
    groupDepth: Double,
    startIndex: Double,
    itemsPerGroup: Double,
    level: Double,
    key: String
  ): js.Array[IGroup] = (^.asInstanceOf[js.Dynamic].applyDynamic("createGroups")(groupCount.asInstanceOf[js.Any], groupDepth.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], itemsPerGroup.asInstanceOf[js.Any], level.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Array[IGroup]]
  inline def createGroups(
    groupCount: Double,
    groupDepth: Double,
    startIndex: Double,
    itemsPerGroup: Double,
    level: Double,
    key: String,
    isCollapsed: Boolean
  ): js.Array[IGroup] = (^.asInstanceOf[js.Dynamic].applyDynamic("createGroups")(groupCount.asInstanceOf[js.Any], groupDepth.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], itemsPerGroup.asInstanceOf[js.Any], level.asInstanceOf[js.Any], key.asInstanceOf[js.Any], isCollapsed.asInstanceOf[js.Any])).asInstanceOf[js.Array[IGroup]]
  inline def createGroups(
    groupCount: Double,
    groupDepth: Double,
    startIndex: Double,
    itemsPerGroup: Double,
    level: Double,
    key: Unit,
    isCollapsed: Boolean
  ): js.Array[IGroup] = (^.asInstanceOf[js.Dynamic].applyDynamic("createGroups")(groupCount.asInstanceOf[js.Any], groupDepth.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], itemsPerGroup.asInstanceOf[js.Any], level.asInstanceOf[js.Any], key.asInstanceOf[js.Any], isCollapsed.asInstanceOf[js.Any])).asInstanceOf[js.Array[IGroup]]
  inline def createGroups(
    groupCount: Double,
    groupDepth: Double,
    startIndex: Double,
    itemsPerGroup: Double,
    level: Unit,
    key: String
  ): js.Array[IGroup] = (^.asInstanceOf[js.Dynamic].applyDynamic("createGroups")(groupCount.asInstanceOf[js.Any], groupDepth.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], itemsPerGroup.asInstanceOf[js.Any], level.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Array[IGroup]]
  inline def createGroups(
    groupCount: Double,
    groupDepth: Double,
    startIndex: Double,
    itemsPerGroup: Double,
    level: Unit,
    key: String,
    isCollapsed: Boolean
  ): js.Array[IGroup] = (^.asInstanceOf[js.Dynamic].applyDynamic("createGroups")(groupCount.asInstanceOf[js.Any], groupDepth.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], itemsPerGroup.asInstanceOf[js.Any], level.asInstanceOf[js.Any], key.asInstanceOf[js.Any], isCollapsed.asInstanceOf[js.Any])).asInstanceOf[js.Array[IGroup]]
  inline def createGroups(
    groupCount: Double,
    groupDepth: Double,
    startIndex: Double,
    itemsPerGroup: Double,
    level: Unit,
    key: Unit,
    isCollapsed: Boolean
  ): js.Array[IGroup] = (^.asInstanceOf[js.Dynamic].applyDynamic("createGroups")(groupCount.asInstanceOf[js.Any], groupDepth.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], itemsPerGroup.asInstanceOf[js.Any], level.asInstanceOf[js.Any], key.asInstanceOf[js.Any], isCollapsed.asInstanceOf[js.Any])).asInstanceOf[js.Array[IGroup]]
  
  inline def createListItems(count: Double): js.Array[IExampleItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("createListItems")(count.asInstanceOf[js.Any]).asInstanceOf[js.Array[IExampleItem]]
  inline def createListItems(count: Double, startIndex: Double): js.Array[IExampleItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("createListItems")(count.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[IExampleItem]]
  
  inline def isGroupable(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGroupable")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def lorem(wordCount: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("lorem")(wordCount.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait IExampleItem extends StObject {
    
    var color: String
    
    var description: String
    
    var height: Double
    
    var key: String
    
    var location: String
    
    var name: String
    
    var shape: String
    
    var thumbnail: String
    
    var width: Double
  }
  object IExampleItem {
    
    inline def apply(
      color: String,
      description: String,
      height: Double,
      key: String,
      location: String,
      name: String,
      shape: String,
      thumbnail: String,
      width: Double
    ): IExampleItem = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[IExampleItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IExampleItem] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
