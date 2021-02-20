package typings.officeUiFabricReact

import typings.officeUiFabricReact.groupedListTypesMod.IGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exampleDataMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/exampleData", "createGroups")
  @js.native
  def createGroups(groupCount: Double, groupDepth: Double, startIndex: Double, itemsPerGroup: Double): js.Array[IGroup] = js.native
  @JSImport("office-ui-fabric-react/lib/utilities/exampleData", "createGroups")
  @js.native
  def createGroups(
    groupCount: Double,
    groupDepth: Double,
    startIndex: Double,
    itemsPerGroup: Double,
    level: js.UndefOr[scala.Nothing],
    key: js.UndefOr[scala.Nothing],
    isCollapsed: Boolean
  ): js.Array[IGroup] = js.native
  @JSImport("office-ui-fabric-react/lib/utilities/exampleData", "createGroups")
  @js.native
  def createGroups(
    groupCount: Double,
    groupDepth: Double,
    startIndex: Double,
    itemsPerGroup: Double,
    level: js.UndefOr[scala.Nothing],
    key: String
  ): js.Array[IGroup] = js.native
  @JSImport("office-ui-fabric-react/lib/utilities/exampleData", "createGroups")
  @js.native
  def createGroups(
    groupCount: Double,
    groupDepth: Double,
    startIndex: Double,
    itemsPerGroup: Double,
    level: js.UndefOr[scala.Nothing],
    key: String,
    isCollapsed: Boolean
  ): js.Array[IGroup] = js.native
  @JSImport("office-ui-fabric-react/lib/utilities/exampleData", "createGroups")
  @js.native
  def createGroups(groupCount: Double, groupDepth: Double, startIndex: Double, itemsPerGroup: Double, level: Double): js.Array[IGroup] = js.native
  @JSImport("office-ui-fabric-react/lib/utilities/exampleData", "createGroups")
  @js.native
  def createGroups(
    groupCount: Double,
    groupDepth: Double,
    startIndex: Double,
    itemsPerGroup: Double,
    level: Double,
    key: js.UndefOr[scala.Nothing],
    isCollapsed: Boolean
  ): js.Array[IGroup] = js.native
  @JSImport("office-ui-fabric-react/lib/utilities/exampleData", "createGroups")
  @js.native
  def createGroups(
    groupCount: Double,
    groupDepth: Double,
    startIndex: Double,
    itemsPerGroup: Double,
    level: Double,
    key: String
  ): js.Array[IGroup] = js.native
  @JSImport("office-ui-fabric-react/lib/utilities/exampleData", "createGroups")
  @js.native
  def createGroups(
    groupCount: Double,
    groupDepth: Double,
    startIndex: Double,
    itemsPerGroup: Double,
    level: Double,
    key: String,
    isCollapsed: Boolean
  ): js.Array[IGroup] = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/exampleData", "createListItems")
  @js.native
  def createListItems(count: Double): js.Array[IExampleItem] = js.native
  @JSImport("office-ui-fabric-react/lib/utilities/exampleData", "createListItems")
  @js.native
  def createListItems(count: Double, startIndex: Double): js.Array[IExampleItem] = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/exampleData", "isGroupable")
  @js.native
  def isGroupable(key: String): Boolean = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/exampleData", "lorem")
  @js.native
  def lorem(wordCount: Double): String = js.native
  
  @js.native
  trait IExampleItem extends StObject {
    
    var color: String = js.native
    
    var description: String = js.native
    
    var height: Double = js.native
    
    var key: String = js.native
    
    var location: String = js.native
    
    var name: String = js.native
    
    var shape: String = js.native
    
    var thumbnail: String = js.native
    
    var width: Double = js.native
  }
  object IExampleItem {
    
    @scala.inline
    def apply(
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
    implicit class IExampleItemMutableBuilder[Self <: IExampleItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
