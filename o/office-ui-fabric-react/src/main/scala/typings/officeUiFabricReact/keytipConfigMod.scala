package typings.officeUiFabricReact

import org.scalablytyped.runtime.StringDictionary
import typings.officeUiFabricReact.anon.PartialIKeytipProps
import typings.officeUiFabricReact.keytipTypesMod.IKeytipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keytipConfigMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/keytips/KeytipConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def buildKeytipConfigMap(config: IKeytipConfig): IKeytipConfigMap = ^.asInstanceOf[js.Dynamic].applyDynamic("buildKeytipConfigMap")(config.asInstanceOf[js.Any]).asInstanceOf[IKeytipConfigMap]
  
  @scala.inline
  def constructKeytip(configMap: IKeytipConfigMap, parentSequence: js.Array[String], keytip: IKeytipConfigItem): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("constructKeytip")(configMap.asInstanceOf[js.Any], parentSequence.asInstanceOf[js.Any], keytip.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait IKeytipConfig extends StObject {
    
    var keytips: js.Array[IKeytipConfigItem]
  }
  object IKeytipConfig {
    
    @scala.inline
    def apply(keytips: js.Array[IKeytipConfigItem]): IKeytipConfig = {
      val __obj = js.Dynamic.literal(keytips = keytips.asInstanceOf[js.Any])
      __obj.asInstanceOf[IKeytipConfig]
    }
    
    @scala.inline
    implicit class IKeytipConfigMutableBuilder[Self <: IKeytipConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeytips(value: js.Array[IKeytipConfigItem]): Self = StObject.set(x, "keytips", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeytipsVarargs(value: IKeytipConfigItem*): Self = StObject.set(x, "keytips", js.Array(value :_*))
    }
  }
  
  trait IKeytipConfigItem extends StObject {
    
    /**
      * Children keytips of this keytip
      */
    var children: js.UndefOr[js.Array[IKeytipConfigItem]] = js.undefined
    
    /**
      * Content for the keytip
      */
    var content: String
    
    /**
      * Identifier for the keytip, to be used to access in the configMap
      */
    var id: String
    
    /**
      * Optional props in IKeytipProps
      */
    var optionalProps: js.UndefOr[PartialIKeytipProps] = js.undefined
    
    /**
      * Key Sequence for this keytip only
      * If sequence is not defined it will be derived from the content string
      */
    var sequence: js.UndefOr[String] = js.undefined
  }
  object IKeytipConfigItem {
    
    @scala.inline
    def apply(content: String, id: String): IKeytipConfigItem = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[IKeytipConfigItem]
    }
    
    @scala.inline
    implicit class IKeytipConfigItemMutableBuilder[Self <: IKeytipConfigItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[IKeytipConfigItem]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: IKeytipConfigItem*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalProps(value: PartialIKeytipProps): Self = StObject.set(x, "optionalProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalPropsUndefined: Self = StObject.set(x, "optionalProps", js.undefined)
      
      @scala.inline
      def setSequence(value: String): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
    }
  }
  
  type IKeytipConfigMap = StringDictionary[IKeytipProps]
}
