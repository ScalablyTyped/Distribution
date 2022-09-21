package typings.minecraftPinger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bold extends StObject {
    
    /**
      * If Text is bold
      */
    var bold: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Color of the text
      */
    var color: js.UndefOr[String] = js.undefined
    
    var extra: js.UndefOr[Color] = js.undefined
    
    /**
      * If Text is strikethroughed
      */
    var strikethrough: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Raw Text
      */
    var text: String
  }
  object Bold {
    
    inline def apply(text: String): Bold = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bold]
    }
    
    extension [Self <: Bold](x: Self) {
      
      inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setExtra(value: Color): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setStrikethrough(value: Boolean): Self = StObject.set(x, "strikethrough", value.asInstanceOf[js.Any])
      
      inline def setStrikethroughUndefined: Self = StObject.set(x, "strikethrough", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait Color extends StObject {
    
    /**
      * Color
      */
    var color: String
    
    /**
      * Raw Text
      */
    var text: String
  }
  object Color {
    
    inline def apply(color: String, text: String): Color = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Color]
    }
    
    extension [Self <: Color](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait Extra extends StObject {
    
    var extra: js.UndefOr[Bold] = js.undefined
    
    /**
      * Raw Text
      */
    var text: String
  }
  object Extra {
    
    inline def apply(text: String): Extra = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Extra]
    }
    
    extension [Self <: Extra](x: Self) {
      
      inline def setExtra(value: Bold): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait Max extends StObject {
    
    /**
      * Maximum Number of players that could be online
      */
    var max: Double
    
    /**
      * Current Number of players online
      */
    var online: Double
  }
  object Max {
    
    inline def apply(max: Double, online: Double): Max = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], online = online.asInstanceOf[js.Any])
      __obj.asInstanceOf[Max]
    }
    
    extension [Self <: Max](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setOnline(value: Double): Self = StObject.set(x, "online", value.asInstanceOf[js.Any])
    }
  }
  
  trait ModList extends StObject {
    
    /**
      * Moderator List May not exist
      */
    var modList: js.Array[String]
    
    /**
      * Mod list type
      */
    var `type`: String
  }
  object ModList {
    
    inline def apply(modList: js.Array[String], `type`: String): ModList = {
      val __obj = js.Dynamic.literal(modList = modList.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModList]
    }
    
    extension [Self <: ModList](x: Self) {
      
      inline def setModList(value: js.Array[String]): Self = StObject.set(x, "modList", value.asInstanceOf[js.Any])
      
      inline def setModListVarargs(value: String*): Self = StObject.set(x, "modList", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    /**
      * Server Software & Version Supports
      */
    var name: String
    
    /**
      * Protocol Version
      */
    var protocol: Double
  }
  object Name {
    
    inline def apply(name: String, protocol: Double): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: Double): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    }
  }
}
