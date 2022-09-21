package typings.mdv

import typings.mdv.anon.Optionswarningstrue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mdv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validate(s: String): ValidateResults = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(s.asInstanceOf[js.Any]).asInstanceOf[ValidateResults]
  inline def validate(s: String, options: Optionswarningstrue): ValidateResults & Warnings = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(s.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ValidateResults & Warnings]
  inline def validate(s: String, options: Options): ValidateResults = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(s.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ValidateResults]
  
  trait Anchor extends StObject {
    
    var defined: Double
    
    var emptyText: Double
    
    var localRefNoHash: Boolean
    
    var name: String
    
    var seen: Double
  }
  object Anchor {
    
    inline def apply(defined: Double, emptyText: Double, localRefNoHash: Boolean, name: String, seen: Double): Anchor = {
      val __obj = js.Dynamic.literal(defined = defined.asInstanceOf[js.Any], emptyText = emptyText.asInstanceOf[js.Any], localRefNoHash = localRefNoHash.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], seen = seen.asInstanceOf[js.Any])
      __obj.asInstanceOf[Anchor]
    }
    
    extension [Self <: Anchor](x: Self) {
      
      inline def setDefined(value: Double): Self = StObject.set(x, "defined", value.asInstanceOf[js.Any])
      
      inline def setEmptyText(value: Double): Self = StObject.set(x, "emptyText", value.asInstanceOf[js.Any])
      
      inline def setLocalRefNoHash(value: Boolean): Self = StObject.set(x, "localRefNoHash", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSeen(value: Double): Self = StObject.set(x, "seen", value.asInstanceOf[js.Any])
    }
  }
  
  trait NonParsedEntry extends StObject {
    
    var `extension`: String
    
    var lineEnd: Double
    
    var lineStart: Double
    
    var message: String
  }
  object NonParsedEntry {
    
    inline def apply(`extension`: String, lineEnd: Double, lineStart: Double, message: String): NonParsedEntry = {
      val __obj = js.Dynamic.literal(lineEnd = lineEnd.asInstanceOf[js.Any], lineStart = lineStart.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NonParsedEntry]
    }
    
    extension [Self <: NonParsedEntry](x: Self) {
      
      inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setLineEnd(value: Double): Self = StObject.set(x, "lineEnd", value.asInstanceOf[js.Any])
      
      inline def setLineStart(value: Double): Self = StObject.set(x, "lineStart", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /**
      * save intermediary html
      * @default false
      */
    var save: js.UndefOr[Boolean] = js.undefined
    
    /**
      * markdown document path
      */
    var source: js.UndefOr[String] = js.undefined
    
    /**
      * enable warnings
      * @default false
      */
    var warnings: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setSave(value: Boolean): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
      
      inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setWarnings(value: Boolean): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    }
  }
  
  trait ValidateResults extends StObject {
    
    var anchorsWithEmptyText: js.Array[Anchor]
    
    var anchorsWithHash: js.Array[Anchor]
    
    var duplicatedAnchors: js.Array[Anchor]
    
    var imagesWithMissingAlt: Double
    
    var localRefNoHash: js.Array[Anchor]
    
    var missingAnchors: js.Array[Anchor]
    
    var nonParsingExamples: js.Array[NonParsedEntry]
    
    var source: String
  }
  object ValidateResults {
    
    inline def apply(
      anchorsWithEmptyText: js.Array[Anchor],
      anchorsWithHash: js.Array[Anchor],
      duplicatedAnchors: js.Array[Anchor],
      imagesWithMissingAlt: Double,
      localRefNoHash: js.Array[Anchor],
      missingAnchors: js.Array[Anchor],
      nonParsingExamples: js.Array[NonParsedEntry],
      source: String
    ): ValidateResults = {
      val __obj = js.Dynamic.literal(anchorsWithEmptyText = anchorsWithEmptyText.asInstanceOf[js.Any], anchorsWithHash = anchorsWithHash.asInstanceOf[js.Any], duplicatedAnchors = duplicatedAnchors.asInstanceOf[js.Any], imagesWithMissingAlt = imagesWithMissingAlt.asInstanceOf[js.Any], localRefNoHash = localRefNoHash.asInstanceOf[js.Any], missingAnchors = missingAnchors.asInstanceOf[js.Any], nonParsingExamples = nonParsingExamples.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidateResults]
    }
    
    extension [Self <: ValidateResults](x: Self) {
      
      inline def setAnchorsWithEmptyText(value: js.Array[Anchor]): Self = StObject.set(x, "anchorsWithEmptyText", value.asInstanceOf[js.Any])
      
      inline def setAnchorsWithEmptyTextVarargs(value: Anchor*): Self = StObject.set(x, "anchorsWithEmptyText", js.Array(value*))
      
      inline def setAnchorsWithHash(value: js.Array[Anchor]): Self = StObject.set(x, "anchorsWithHash", value.asInstanceOf[js.Any])
      
      inline def setAnchorsWithHashVarargs(value: Anchor*): Self = StObject.set(x, "anchorsWithHash", js.Array(value*))
      
      inline def setDuplicatedAnchors(value: js.Array[Anchor]): Self = StObject.set(x, "duplicatedAnchors", value.asInstanceOf[js.Any])
      
      inline def setDuplicatedAnchorsVarargs(value: Anchor*): Self = StObject.set(x, "duplicatedAnchors", js.Array(value*))
      
      inline def setImagesWithMissingAlt(value: Double): Self = StObject.set(x, "imagesWithMissingAlt", value.asInstanceOf[js.Any])
      
      inline def setLocalRefNoHash(value: js.Array[Anchor]): Self = StObject.set(x, "localRefNoHash", value.asInstanceOf[js.Any])
      
      inline def setLocalRefNoHashVarargs(value: Anchor*): Self = StObject.set(x, "localRefNoHash", js.Array(value*))
      
      inline def setMissingAnchors(value: js.Array[Anchor]): Self = StObject.set(x, "missingAnchors", value.asInstanceOf[js.Any])
      
      inline def setMissingAnchorsVarargs(value: Anchor*): Self = StObject.set(x, "missingAnchors", js.Array(value*))
      
      inline def setNonParsingExamples(value: js.Array[NonParsedEntry]): Self = StObject.set(x, "nonParsingExamples", value.asInstanceOf[js.Any])
      
      inline def setNonParsingExamplesVarargs(value: NonParsedEntry*): Self = StObject.set(x, "nonParsingExamples", js.Array(value*))
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait Warnings extends StObject {
    
    var anchorsWithNoLinks: js.Array[Anchor]
    
    var codeBlocksWithNoLanguage: Double
  }
  object Warnings {
    
    inline def apply(anchorsWithNoLinks: js.Array[Anchor], codeBlocksWithNoLanguage: Double): Warnings = {
      val __obj = js.Dynamic.literal(anchorsWithNoLinks = anchorsWithNoLinks.asInstanceOf[js.Any], codeBlocksWithNoLanguage = codeBlocksWithNoLanguage.asInstanceOf[js.Any])
      __obj.asInstanceOf[Warnings]
    }
    
    extension [Self <: Warnings](x: Self) {
      
      inline def setAnchorsWithNoLinks(value: js.Array[Anchor]): Self = StObject.set(x, "anchorsWithNoLinks", value.asInstanceOf[js.Any])
      
      inline def setAnchorsWithNoLinksVarargs(value: Anchor*): Self = StObject.set(x, "anchorsWithNoLinks", js.Array(value*))
      
      inline def setCodeBlocksWithNoLanguage(value: Double): Self = StObject.set(x, "codeBlocksWithNoLanguage", value.asInstanceOf[js.Any])
    }
  }
}
