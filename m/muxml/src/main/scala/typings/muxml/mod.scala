package typings.muxml

import typings.muxml.muxmlStrings.spaces
import typings.muxml.muxmlStrings.tabs
import typings.node.streamMod.Transform
import typings.sax.mod.SAXOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Transform = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Transform]
  inline def apply(options: Options): Transform = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Transform]
  
  @JSImport("muxml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * Filter XML with tags with name matching the filter.
      *
      * @default null
      */
    var filter: js.UndefOr[String | Null] = js.undefined
    
    /**
      * When pretty is set to true and indentStyle is set to spaces, then indent with this number of spaces.
      *
      * @default 2
      */
    var indentSpaces: js.UndefOr[Double] = js.undefined
    
    /**
      * When pretty is set to true, indent with either spaces or tabs.
      *
      * @default 'spaces'
      */
    var indentStyle: js.UndefOr[spaces | tabs] = js.undefined
    
    /**
      * When pretty is set to true and indentStyle is set to tabs, then indent with this number of tabs.
      *
      * @default 1
      */
    var indentTabs: js.UndefOr[Double] = js.undefined
    
    /**
      * Prettify the output. If true, output has newlines and indentation.
      *
      * @default true
      */
    var pretty: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default {}
      */
    var saxOptions: js.UndefOr[SAXOptions] = js.undefined
    
    /**
      * @default true
      */
    var strict: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Strip attributes from tags.
      *
      * @default false
      */
    var stripAttributes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Strip CDATA tags.
      *
      * @default true
      */
    var stripCdata: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Strip XML comments.
      *
      * @default true
      */
    var stripComments: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Strip <!DOCTYPE declarations.
      *
      * @default true
      */
    var stripDoctype: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Strip processing instruction (like <?xml foo="blerg" ?>) tags.
      *
      * @default true
      */
    var stripInstruction: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default null
      */
    var tagFilter: js.UndefOr[String | Null] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterNull: Self = StObject.set(x, "filter", null)
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setIndentSpaces(value: Double): Self = StObject.set(x, "indentSpaces", value.asInstanceOf[js.Any])
      
      inline def setIndentSpacesUndefined: Self = StObject.set(x, "indentSpaces", js.undefined)
      
      inline def setIndentStyle(value: spaces | tabs): Self = StObject.set(x, "indentStyle", value.asInstanceOf[js.Any])
      
      inline def setIndentStyleUndefined: Self = StObject.set(x, "indentStyle", js.undefined)
      
      inline def setIndentTabs(value: Double): Self = StObject.set(x, "indentTabs", value.asInstanceOf[js.Any])
      
      inline def setIndentTabsUndefined: Self = StObject.set(x, "indentTabs", js.undefined)
      
      inline def setPretty(value: Boolean): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
      
      inline def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
      
      inline def setSaxOptions(value: SAXOptions): Self = StObject.set(x, "saxOptions", value.asInstanceOf[js.Any])
      
      inline def setSaxOptionsUndefined: Self = StObject.set(x, "saxOptions", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      inline def setStripAttributes(value: Boolean): Self = StObject.set(x, "stripAttributes", value.asInstanceOf[js.Any])
      
      inline def setStripAttributesUndefined: Self = StObject.set(x, "stripAttributes", js.undefined)
      
      inline def setStripCdata(value: Boolean): Self = StObject.set(x, "stripCdata", value.asInstanceOf[js.Any])
      
      inline def setStripCdataUndefined: Self = StObject.set(x, "stripCdata", js.undefined)
      
      inline def setStripComments(value: Boolean): Self = StObject.set(x, "stripComments", value.asInstanceOf[js.Any])
      
      inline def setStripCommentsUndefined: Self = StObject.set(x, "stripComments", js.undefined)
      
      inline def setStripDoctype(value: Boolean): Self = StObject.set(x, "stripDoctype", value.asInstanceOf[js.Any])
      
      inline def setStripDoctypeUndefined: Self = StObject.set(x, "stripDoctype", js.undefined)
      
      inline def setStripInstruction(value: Boolean): Self = StObject.set(x, "stripInstruction", value.asInstanceOf[js.Any])
      
      inline def setStripInstructionUndefined: Self = StObject.set(x, "stripInstruction", js.undefined)
      
      inline def setTagFilter(value: String): Self = StObject.set(x, "tagFilter", value.asInstanceOf[js.Any])
      
      inline def setTagFilterNull: Self = StObject.set(x, "tagFilter", null)
      
      inline def setTagFilterUndefined: Self = StObject.set(x, "tagFilter", js.undefined)
    }
  }
}
