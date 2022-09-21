package typings.micromarkExtensionFrontmatter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mattersMod {
  
  @JSImport("micromark-extension-frontmatter/dev/matters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def matters(): js.Array[Matter] = ^.asInstanceOf[js.Dynamic].applyDynamic("matters")().asInstanceOf[js.Array[Matter]]
  inline def matters(options: Options): js.Array[Matter] = ^.asInstanceOf[js.Dynamic].applyDynamic("matters")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[Matter]]
  
  trait FenceProps extends StObject {
    
    /**
      * String used as the complete fence.
      * By providing an object with `open` and `close` different values can be used
      * for opening and closing fences.
      * This can be used too if fences contain different characters or lengths
      * other than 3.
      */
    var fence: String | Info
    
    var marker: Unit
  }
  object FenceProps {
    
    inline def apply(fence: String | Info, marker: Unit): FenceProps = {
      val __obj = js.Dynamic.literal(fence = fence.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any])
      __obj.asInstanceOf[FenceProps]
    }
    
    extension [Self <: FenceProps](x: Self) {
      
      inline def setFence(value: String | Info): Self = StObject.set(x, "fence", value.asInstanceOf[js.Any])
      
      inline def setMarker(value: Unit): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    }
  }
  
  trait Info extends StObject {
    
    var close: String
    
    var open: String
  }
  object Info {
    
    inline def apply(close: String, open: String): Info = {
      val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[Info]
    }
    
    extension [Self <: Info](x: Self) {
      
      inline def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setOpen(value: String): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    }
  }
  
  trait MarkerProps extends StObject {
    
    var fence: Unit
    
    /**
      * Character used to construct fences.
      * By providing an object with `open` and `close` different characters can be
      * used for opening and closing fences.
      * For example the character `'-'` will result in `'---'` being used as the
      * fence
      */
    var marker: String | Info
  }
  object MarkerProps {
    
    inline def apply(fence: Unit, marker: String | Info): MarkerProps = {
      val __obj = js.Dynamic.literal(fence = fence.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarkerProps]
    }
    
    extension [Self <: MarkerProps](x: Self) {
      
      inline def setFence(value: Unit): Self = StObject.set(x, "fence", value.asInstanceOf[js.Any])
      
      inline def setMarker(value: String | Info): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    }
  }
  
  type Matter = (MatterProps & FenceProps) | (MatterProps & MarkerProps)
  
  trait MatterProps extends StObject {
    
    /**
      * If `true`, matter can be found anywhere in the document.
      * If `false` (default), only matter at the start of the document is
      * recognized.
      */
    var anywhere: js.UndefOr[Boolean] = js.undefined
    
    /**
      *  Type to tokenize as
      */
    var `type`: String
  }
  object MatterProps {
    
    inline def apply(`type`: String): MatterProps = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatterProps]
    }
    
    extension [Self <: MatterProps](x: Self) {
      
      inline def setAnywhere(value: Boolean): Self = StObject.set(x, "anywhere", value.asInstanceOf[js.Any])
      
      inline def setAnywhereUndefined: Self = StObject.set(x, "anywhere", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Options = Preset | Matter | (js.Array[Preset | Matter])
  
  /* Rewritten from type alias, can be one of: 
    - typings.micromarkExtensionFrontmatter.micromarkExtensionFrontmatterStrings.yaml
    - typings.micromarkExtensionFrontmatter.micromarkExtensionFrontmatterStrings.toml
  */
  trait Preset extends StObject
  object Preset {
    
    inline def toml: typings.micromarkExtensionFrontmatter.micromarkExtensionFrontmatterStrings.toml = "toml".asInstanceOf[typings.micromarkExtensionFrontmatter.micromarkExtensionFrontmatterStrings.toml]
    
    inline def yaml: typings.micromarkExtensionFrontmatter.micromarkExtensionFrontmatterStrings.yaml = "yaml".asInstanceOf[typings.micromarkExtensionFrontmatter.micromarkExtensionFrontmatterStrings.yaml]
  }
}
