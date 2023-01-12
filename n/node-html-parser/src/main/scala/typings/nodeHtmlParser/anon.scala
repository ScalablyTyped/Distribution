package typings.nodeHtmlParser

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ClosingSlash extends StObject {
    
    /**
      * void tag serialisation, add a final slash <br/>
      */
    var closingSlash: js.UndefOr[Boolean] = js.undefined
    
    /**
      * options, default value is ['area', 'base', 'br', 'col', 'embed', 'hr', 'img', 'input', 'link', 'meta', 'param', 'source', 'track', 'wbr']
      */
    var tags: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ClosingSlash {
    
    inline def apply(): ClosingSlash = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClosingSlash]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClosingSlash] (val x: Self) extends AnyVal {
      
      inline def setClosingSlash(value: Boolean): Self = StObject.set(x, "closingSlash", value.asInstanceOf[js.Any])
      
      inline def setClosingSlashUndefined: Self = StObject.set(x, "closingSlash", js.undefined)
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    }
  }
  
  /* Inlined std.Partial<node-html-parser.node-html-parser/dist/nodes/html.Options> */
  trait PartialOptions extends StObject {
    
    var blockTextElements: js.UndefOr[StringDictionary[Boolean]] = js.undefined
    
    var comment: js.UndefOr[Boolean] = js.undefined
    
    var fixNestedATags: js.UndefOr[Boolean] = js.undefined
    
    var lowerCaseTagName: js.UndefOr[Boolean] = js.undefined
    
    var parseNoneClosedTags: js.UndefOr[Boolean] = js.undefined
    
    var voidTag: js.UndefOr[ClosingSlash] = js.undefined
  }
  object PartialOptions {
    
    inline def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
      
      inline def setBlockTextElements(value: StringDictionary[Boolean]): Self = StObject.set(x, "blockTextElements", value.asInstanceOf[js.Any])
      
      inline def setBlockTextElementsUndefined: Self = StObject.set(x, "blockTextElements", js.undefined)
      
      inline def setComment(value: Boolean): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setFixNestedATags(value: Boolean): Self = StObject.set(x, "fixNestedATags", value.asInstanceOf[js.Any])
      
      inline def setFixNestedATagsUndefined: Self = StObject.set(x, "fixNestedATags", js.undefined)
      
      inline def setLowerCaseTagName(value: Boolean): Self = StObject.set(x, "lowerCaseTagName", value.asInstanceOf[js.Any])
      
      inline def setLowerCaseTagNameUndefined: Self = StObject.set(x, "lowerCaseTagName", js.undefined)
      
      inline def setParseNoneClosedTags(value: Boolean): Self = StObject.set(x, "parseNoneClosedTags", value.asInstanceOf[js.Any])
      
      inline def setParseNoneClosedTagsUndefined: Self = StObject.set(x, "parseNoneClosedTags", js.undefined)
      
      inline def setVoidTag(value: ClosingSlash): Self = StObject.set(x, "voidTag", value.asInstanceOf[js.Any])
      
      inline def setVoidTagUndefined: Self = StObject.set(x, "voidTag", js.undefined)
    }
  }
}
