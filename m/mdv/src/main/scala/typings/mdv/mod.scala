package typings.mdv

import typings.mdv.anon.Optionswarningstrue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mdv", "validate")
  @js.native
  def validate(s: String): ValidateResults = js.native
  @JSImport("mdv", "validate")
  @js.native
  def validate(s: String, options: Optionswarningstrue): ValidateResults with Warnings = js.native
  @JSImport("mdv", "validate")
  @js.native
  def validate(s: String, options: Options): ValidateResults = js.native
  
  @js.native
  trait Anchor extends StObject {
    
    var defined: Double = js.native
    
    var emptyText: Double = js.native
    
    var localRefNoHash: Boolean = js.native
    
    var name: String = js.native
    
    var seen: Double = js.native
  }
  object Anchor {
    
    @scala.inline
    def apply(defined: Double, emptyText: Double, localRefNoHash: Boolean, name: String, seen: Double): Anchor = {
      val __obj = js.Dynamic.literal(defined = defined.asInstanceOf[js.Any], emptyText = emptyText.asInstanceOf[js.Any], localRefNoHash = localRefNoHash.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], seen = seen.asInstanceOf[js.Any])
      __obj.asInstanceOf[Anchor]
    }
    
    @scala.inline
    implicit class AnchorMutableBuilder[Self <: Anchor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefined(value: Double): Self = StObject.set(x, "defined", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyText(value: Double): Self = StObject.set(x, "emptyText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalRefNoHash(value: Boolean): Self = StObject.set(x, "localRefNoHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeen(value: Double): Self = StObject.set(x, "seen", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NonParsedEntry extends StObject {
    
    var extension: String = js.native
    
    var lineEnd: Double = js.native
    
    var lineStart: Double = js.native
    
    var message: String = js.native
  }
  object NonParsedEntry {
    
    @scala.inline
    def apply(extension: String, lineEnd: Double, lineStart: Double, message: String): NonParsedEntry = {
      val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any], lineEnd = lineEnd.asInstanceOf[js.Any], lineStart = lineStart.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[NonParsedEntry]
    }
    
    @scala.inline
    implicit class NonParsedEntryMutableBuilder[Self <: NonParsedEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineEnd(value: Double): Self = StObject.set(x, "lineEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineStart(value: Double): Self = StObject.set(x, "lineStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * save intermediary html
      * @default false
      */
    var save: js.UndefOr[Boolean] = js.native
    
    /**
      * markdown document path
      */
    var source: js.UndefOr[String] = js.native
    
    /**
      * enable warnings
      * @default false
      */
    var warnings: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSave(value: Boolean): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setWarnings(value: Boolean): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    }
  }
  
  @js.native
  trait ValidateResults extends StObject {
    
    var anchorsWithEmptyText: js.Array[Anchor] = js.native
    
    var anchorsWithHash: js.Array[Anchor] = js.native
    
    var duplicatedAnchors: js.Array[Anchor] = js.native
    
    var imagesWithMissingAlt: Double = js.native
    
    var localRefNoHash: js.Array[Anchor] = js.native
    
    var missingAnchors: js.Array[Anchor] = js.native
    
    var nonParsingExamples: js.Array[NonParsedEntry] = js.native
    
    var source: String = js.native
  }
  object ValidateResults {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ValidateResultsMutableBuilder[Self <: ValidateResults] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchorsWithEmptyText(value: js.Array[Anchor]): Self = StObject.set(x, "anchorsWithEmptyText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorsWithEmptyTextVarargs(value: Anchor*): Self = StObject.set(x, "anchorsWithEmptyText", js.Array(value :_*))
      
      @scala.inline
      def setAnchorsWithHash(value: js.Array[Anchor]): Self = StObject.set(x, "anchorsWithHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorsWithHashVarargs(value: Anchor*): Self = StObject.set(x, "anchorsWithHash", js.Array(value :_*))
      
      @scala.inline
      def setDuplicatedAnchors(value: js.Array[Anchor]): Self = StObject.set(x, "duplicatedAnchors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuplicatedAnchorsVarargs(value: Anchor*): Self = StObject.set(x, "duplicatedAnchors", js.Array(value :_*))
      
      @scala.inline
      def setImagesWithMissingAlt(value: Double): Self = StObject.set(x, "imagesWithMissingAlt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalRefNoHash(value: js.Array[Anchor]): Self = StObject.set(x, "localRefNoHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalRefNoHashVarargs(value: Anchor*): Self = StObject.set(x, "localRefNoHash", js.Array(value :_*))
      
      @scala.inline
      def setMissingAnchors(value: js.Array[Anchor]): Self = StObject.set(x, "missingAnchors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMissingAnchorsVarargs(value: Anchor*): Self = StObject.set(x, "missingAnchors", js.Array(value :_*))
      
      @scala.inline
      def setNonParsingExamples(value: js.Array[NonParsedEntry]): Self = StObject.set(x, "nonParsingExamples", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonParsingExamplesVarargs(value: NonParsedEntry*): Self = StObject.set(x, "nonParsingExamples", js.Array(value :_*))
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Warnings extends StObject {
    
    var anchorsWithNoLinks: js.Array[Anchor] = js.native
    
    var codeBlocksWithNoLanguage: Double = js.native
  }
  object Warnings {
    
    @scala.inline
    def apply(anchorsWithNoLinks: js.Array[Anchor], codeBlocksWithNoLanguage: Double): Warnings = {
      val __obj = js.Dynamic.literal(anchorsWithNoLinks = anchorsWithNoLinks.asInstanceOf[js.Any], codeBlocksWithNoLanguage = codeBlocksWithNoLanguage.asInstanceOf[js.Any])
      __obj.asInstanceOf[Warnings]
    }
    
    @scala.inline
    implicit class WarningsMutableBuilder[Self <: Warnings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchorsWithNoLinks(value: js.Array[Anchor]): Self = StObject.set(x, "anchorsWithNoLinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorsWithNoLinksVarargs(value: Anchor*): Self = StObject.set(x, "anchorsWithNoLinks", js.Array(value :_*))
      
      @scala.inline
      def setCodeBlocksWithNoLanguage(value: Double): Self = StObject.set(x, "codeBlocksWithNoLanguage", value.asInstanceOf[js.Any])
    }
  }
}
