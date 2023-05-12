package typings.mdastUtilFromMarkdown

import typings.mdastUtilFromMarkdown.libMod.Encoding
import typings.mdastUtilFromMarkdown.libMod.OnEnterError
import typings.mdastUtilFromMarkdown.libMod.Options
import typings.mdastUtilFromMarkdown.libMod.Root
import typings.mdastUtilFromMarkdown.libMod.Value
import typings.mdastUtilFromMarkdown.mdastUtilFromMarkdownStrings.characterReferenceMarkerHexadecimal
import typings.mdastUtilFromMarkdown.mdastUtilFromMarkdownStrings.characterReferenceMarkerNumeric
import typings.mdastUtilFromMarkdown.mdastUtilFromMarkdownStrings.collapsed
import typings.mdastUtilFromMarkdown.mdastUtilFromMarkdownStrings.full
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mdast-util-from-markdown", "fromMarkdown")
  @js.native
  val fromMarkdown: (js.Function3[
    /* value */ Value, 
    /* encoding */ Encoding, 
    /* options */ js.UndefOr[Options | Null], 
    Root
  ]) & (js.Function2[/* value */ Value, /* options */ js.UndefOr[Options | Null], Root]) = js.native
  
  trait CompileData extends StObject {
    
    /**
      * Whether we’re inside a hard break.
      */
    var atHardBreak: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Current character reference type.
      */
    var characterReferenceType: js.UndefOr[characterReferenceMarkerHexadecimal | characterReferenceMarkerNumeric] = js.undefined
    
    /**
      * Whether a first list item value (`1` in `1. a`) is expected.
      */
    var expectingFirstListItemValue: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether we’re in flow code.
      */
    var flowCodeInside: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether we’re in a reference.
      */
    var inReference: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Current reference.
      */
    var referenceType: js.UndefOr[collapsed | full] = js.undefined
    
    /**
      * Whether we’re expecting a line ending from a setext heading, which can be slurped.
      */
    var setextHeadingSlurpLineEnding: js.UndefOr[Boolean] = js.undefined
  }
  object CompileData {
    
    inline def apply(): CompileData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompileData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompileData] (val x: Self) extends AnyVal {
      
      inline def setAtHardBreak(value: Boolean): Self = StObject.set(x, "atHardBreak", value.asInstanceOf[js.Any])
      
      inline def setAtHardBreakUndefined: Self = StObject.set(x, "atHardBreak", js.undefined)
      
      inline def setCharacterReferenceType(value: characterReferenceMarkerHexadecimal | characterReferenceMarkerNumeric): Self = StObject.set(x, "characterReferenceType", value.asInstanceOf[js.Any])
      
      inline def setCharacterReferenceTypeUndefined: Self = StObject.set(x, "characterReferenceType", js.undefined)
      
      inline def setExpectingFirstListItemValue(value: Boolean): Self = StObject.set(x, "expectingFirstListItemValue", value.asInstanceOf[js.Any])
      
      inline def setExpectingFirstListItemValueUndefined: Self = StObject.set(x, "expectingFirstListItemValue", js.undefined)
      
      inline def setFlowCodeInside(value: Boolean): Self = StObject.set(x, "flowCodeInside", value.asInstanceOf[js.Any])
      
      inline def setFlowCodeInsideUndefined: Self = StObject.set(x, "flowCodeInside", js.undefined)
      
      inline def setInReference(value: Boolean): Self = StObject.set(x, "inReference", value.asInstanceOf[js.Any])
      
      inline def setInReferenceUndefined: Self = StObject.set(x, "inReference", js.undefined)
      
      inline def setReferenceType(value: collapsed | full): Self = StObject.set(x, "referenceType", value.asInstanceOf[js.Any])
      
      inline def setReferenceTypeUndefined: Self = StObject.set(x, "referenceType", js.undefined)
      
      inline def setSetextHeadingSlurpLineEnding(value: Boolean): Self = StObject.set(x, "setextHeadingSlurpLineEnding", value.asInstanceOf[js.Any])
      
      inline def setSetextHeadingSlurpLineEndingUndefined: Self = StObject.set(x, "setextHeadingSlurpLineEnding", js.undefined)
    }
  }
  
  type OnError = OnEnterError
}
