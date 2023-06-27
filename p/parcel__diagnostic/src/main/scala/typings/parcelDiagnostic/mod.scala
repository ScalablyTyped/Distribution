package typings.parcelDiagnostic

import typings.parcelDiagnostic.anon.Column
import typings.parcelDiagnostic.anon.Data
import typings.parcelDiagnostic.anon.End
import typings.parcelDiagnostic.anon.EndStart
import typings.parcelDiagnostic.anon.FilePath
import typings.parcelDiagnostic.anon.Key
import typings.parcelDiagnostic.anon.Start
import typings.parcelDiagnostic.parcelDiagnosticStrings.key
import typings.parcelDiagnostic.parcelDiagnosticStrings.value
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@parcel/diagnostic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@parcel/diagnostic", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ThrowableDiagnostic {
    def this(opts: ThrowableDiagnosticOpts) = this()
    
    /* CompleteClass */
    var diagnostics: js.Array[Diagnostic] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def anyToDiagnostic(input: Diagnostifiable): js.Array[Diagnostic] = ^.asInstanceOf[js.Dynamic].applyDynamic("anyToDiagnostic")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[Diagnostic]]
  
  inline def convertSourceLocationToHighlight[Location /* <: EndStart */](param0: Location): DiagnosticCodeHighlight = ^.asInstanceOf[js.Dynamic].applyDynamic("convertSourceLocationToHighlight")(param0.asInstanceOf[js.Any]).asInstanceOf[DiagnosticCodeHighlight]
  inline def convertSourceLocationToHighlight[Location /* <: EndStart */](param0: Location, message: String): DiagnosticCodeHighlight = (^.asInstanceOf[js.Dynamic].applyDynamic("convertSourceLocationToHighlight")(param0.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[DiagnosticCodeHighlight]
  
  inline def encodeJSONKeyComponent(component: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeJSONKeyComponent")(component.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def errorToDiagnostic(error: String): js.Array[Diagnostic] = ^.asInstanceOf[js.Dynamic].applyDynamic("errorToDiagnostic")(error.asInstanceOf[js.Any]).asInstanceOf[js.Array[Diagnostic]]
  inline def errorToDiagnostic(error: String, defaultValues: FilePath): js.Array[Diagnostic] = (^.asInstanceOf[js.Dynamic].applyDynamic("errorToDiagnostic")(error.asInstanceOf[js.Any], defaultValues.asInstanceOf[js.Any])).asInstanceOf[js.Array[Diagnostic]]
  inline def errorToDiagnostic(error: PrintableError): js.Array[Diagnostic] = ^.asInstanceOf[js.Dynamic].applyDynamic("errorToDiagnostic")(error.asInstanceOf[js.Any]).asInstanceOf[js.Array[Diagnostic]]
  inline def errorToDiagnostic(error: PrintableError, defaultValues: FilePath): js.Array[Diagnostic] = (^.asInstanceOf[js.Dynamic].applyDynamic("errorToDiagnostic")(error.asInstanceOf[js.Any], defaultValues.asInstanceOf[js.Any])).asInstanceOf[js.Array[Diagnostic]]
  inline def errorToDiagnostic(error: ThrowableDiagnostic): js.Array[Diagnostic] = ^.asInstanceOf[js.Dynamic].applyDynamic("errorToDiagnostic")(error.asInstanceOf[js.Any]).asInstanceOf[js.Array[Diagnostic]]
  inline def errorToDiagnostic(error: ThrowableDiagnostic, defaultValues: FilePath): js.Array[Diagnostic] = (^.asInstanceOf[js.Dynamic].applyDynamic("errorToDiagnostic")(error.asInstanceOf[js.Any], defaultValues.asInstanceOf[js.Any])).asInstanceOf[js.Array[Diagnostic]]
  
  inline def escapeMarkdown(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeMarkdown")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def generateJSONCodeHighlights(data: String, ids: js.Array[Key]): js.Array[DiagnosticCodeHighlight] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateJSONCodeHighlights")(data.asInstanceOf[js.Any], ids.asInstanceOf[js.Any])).asInstanceOf[js.Array[DiagnosticCodeHighlight]]
  inline def generateJSONCodeHighlights(data: Data, ids: js.Array[Key]): js.Array[DiagnosticCodeHighlight] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateJSONCodeHighlights")(data.asInstanceOf[js.Any], ids.asInstanceOf[js.Any])).asInstanceOf[js.Array[DiagnosticCodeHighlight]]
  
  inline def getJSONHighlightLocation(
    pos: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Mapping */ Any
  ): End = ^.asInstanceOf[js.Dynamic].applyDynamic("getJSONHighlightLocation")(pos.asInstanceOf[js.Any]).asInstanceOf[End]
  inline def getJSONHighlightLocation(
    pos: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Mapping */ Any,
    `type`: key | value
  ): End = (^.asInstanceOf[js.Dynamic].applyDynamic("getJSONHighlightLocation")(pos.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[End]
  
  inline def getJSONSourceLocation(
    pos: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Mapping */ Any
  ): Start = ^.asInstanceOf[js.Dynamic].applyDynamic("getJSONSourceLocation")(pos.asInstanceOf[js.Any]).asInstanceOf[Start]
  inline def getJSONSourceLocation(
    pos: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Mapping */ Any,
    `type`: key | value
  ): Start = (^.asInstanceOf[js.Dynamic].applyDynamic("getJSONSourceLocation")(pos.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Start]
  
  object md {
    
    inline def apply(strings: js.Array[String], params: TemplateInput*): String = ^.asInstanceOf[js.Dynamic].apply(scala.List(strings.asInstanceOf[js.Any]).`++`(params.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
    
    @JSImport("@parcel/diagnostic", "md")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@parcel/diagnostic", "md.bold")
    @js.native
    def bold: js.Function1[/* s */ Any, Any] = js.native
    inline def bold_=(x: js.Function1[/* s */ Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bold")(x.asInstanceOf[js.Any])
    
    @JSImport("@parcel/diagnostic", "md.italic")
    @js.native
    def italic: js.Function1[/* s */ Any, Any] = js.native
    inline def italic_=(x: js.Function1[/* s */ Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("italic")(x.asInstanceOf[js.Any])
    
    @JSImport("@parcel/diagnostic", "md.strikethrough")
    @js.native
    def strikethrough: js.Function1[/* s */ Any, Any] = js.native
    inline def strikethrough_=(x: js.Function1[/* s */ Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("strikethrough")(x.asInstanceOf[js.Any])
    
    @JSImport("@parcel/diagnostic", "md.underline")
    @js.native
    def underline: js.Function1[/* s */ Any, Any] = js.native
    inline def underline_=(x: js.Function1[/* s */ Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("underline")(x.asInstanceOf[js.Any])
  }
  
  trait Diagnostic
    extends StObject
       with _Diagnostifiable {
    
    /** A code frame points to a certain location(s) in the file this diagnostic is linked to (optional) */
    var codeFrames: js.UndefOr[js.Array[DiagnosticCodeFrame] | Null] = js.undefined
    
    /** A URL to documentation to learn more about the diagnostic. */
    var documentationURL: js.UndefOr[String] = js.undefined
    
    /** An optional list of strings that suggest ways to resolve this issue */
    var hints: js.UndefOr[js.Array[String]] = js.undefined
    
    /** This is the message you want to log. */
    var message: String
    
    /** Name of the error (optional) */
    var name: js.UndefOr[String] = js.undefined
    
    /** Name of plugin or file that threw this error */
    var origin: js.UndefOr[String] = js.undefined
    
    /** @private */
    var skipFormatting: js.UndefOr[Boolean] = js.undefined
    
    /** A stacktrace of the error (optional) */
    var stack: js.UndefOr[String] = js.undefined
  }
  object Diagnostic {
    
    inline def apply(message: String): Diagnostic = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Diagnostic]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Diagnostic] (val x: Self) extends AnyVal {
      
      inline def setCodeFrames(value: js.Array[DiagnosticCodeFrame]): Self = StObject.set(x, "codeFrames", value.asInstanceOf[js.Any])
      
      inline def setCodeFramesNull: Self = StObject.set(x, "codeFrames", null)
      
      inline def setCodeFramesUndefined: Self = StObject.set(x, "codeFrames", js.undefined)
      
      inline def setCodeFramesVarargs(value: DiagnosticCodeFrame*): Self = StObject.set(x, "codeFrames", js.Array(value*))
      
      inline def setDocumentationURL(value: String): Self = StObject.set(x, "documentationURL", value.asInstanceOf[js.Any])
      
      inline def setDocumentationURLUndefined: Self = StObject.set(x, "documentationURL", js.undefined)
      
      inline def setHints(value: js.Array[String]): Self = StObject.set(x, "hints", value.asInstanceOf[js.Any])
      
      inline def setHintsUndefined: Self = StObject.set(x, "hints", js.undefined)
      
      inline def setHintsVarargs(value: String*): Self = StObject.set(x, "hints", js.Array(value*))
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setSkipFormatting(value: Boolean): Self = StObject.set(x, "skipFormatting", value.asInstanceOf[js.Any])
      
      inline def setSkipFormattingUndefined: Self = StObject.set(x, "skipFormatting", js.undefined)
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  trait DiagnosticCodeFrame extends StObject {
    
    /**
      * The contents of the source file.
      *
      * If no code is passed, it will be read in from filePath, remember that
      * the asset's current code could be different from the input contents.
      *
      */
    var code: js.UndefOr[String] = js.undefined
    
    var codeHighlights: js.Array[DiagnosticCodeHighlight]
    
    /** Path to the file this code frame is about (optional, absolute or relative to the project root) */
    var filePath: js.UndefOr[String] = js.undefined
    
    /** Language of the file this code frame is about (optional) */
    var language: js.UndefOr[String] = js.undefined
  }
  object DiagnosticCodeFrame {
    
    inline def apply(codeHighlights: js.Array[DiagnosticCodeHighlight]): DiagnosticCodeFrame = {
      val __obj = js.Dynamic.literal(codeHighlights = codeHighlights.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiagnosticCodeFrame]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DiagnosticCodeFrame] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeHighlights(value: js.Array[DiagnosticCodeHighlight]): Self = StObject.set(x, "codeHighlights", value.asInstanceOf[js.Any])
      
      inline def setCodeHighlightsVarargs(value: DiagnosticCodeHighlight*): Self = StObject.set(x, "codeHighlights", js.Array(value*))
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    }
  }
  
  trait DiagnosticCodeHighlight extends StObject {
    
    /** Location of the last character that should get highlighted for this highlight. */
    var end: DiagnosticHighlightLocation
    
    /** A message that should be displayed at this location in the code (optional). */
    var message: js.UndefOr[String] = js.undefined
    
    /** Location of the first character that should get highlighted for this highlight. */
    var start: DiagnosticHighlightLocation
  }
  object DiagnosticCodeHighlight {
    
    inline def apply(end: DiagnosticHighlightLocation, start: DiagnosticHighlightLocation): DiagnosticCodeHighlight = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiagnosticCodeHighlight]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DiagnosticCodeHighlight] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: DiagnosticHighlightLocation): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setStart(value: DiagnosticHighlightLocation): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait DiagnosticHighlightLocation extends StObject {
    
    val column: Double
    
    val line: Double
  }
  object DiagnosticHighlightLocation {
    
    inline def apply(column: Double, line: Double): DiagnosticHighlightLocation = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiagnosticHighlightLocation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DiagnosticHighlightLocation] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.parcelDiagnostic.parcelDiagnosticStrings.error
    - typings.parcelDiagnostic.parcelDiagnosticStrings.warn
    - typings.parcelDiagnostic.parcelDiagnosticStrings.info
  */
  trait DiagnosticSeverity extends StObject
  object DiagnosticSeverity {
    
    inline def error: typings.parcelDiagnostic.parcelDiagnosticStrings.error = "error".asInstanceOf[typings.parcelDiagnostic.parcelDiagnosticStrings.error]
    
    inline def info: typings.parcelDiagnostic.parcelDiagnosticStrings.info = "info".asInstanceOf[typings.parcelDiagnostic.parcelDiagnosticStrings.info]
    
    inline def warn: typings.parcelDiagnostic.parcelDiagnosticStrings.warn = "warn".asInstanceOf[typings.parcelDiagnostic.parcelDiagnosticStrings.warn]
  }
  
  trait DiagnosticWithoutOrigin
    extends StObject
       with Diagnostic
  object DiagnosticWithoutOrigin {
    
    inline def apply(message: String): DiagnosticWithoutOrigin = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiagnosticWithoutOrigin]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.parcelDiagnostic.mod.Diagnostic
    - js.Array[typings.parcelDiagnostic.mod.Diagnostic]
    - typings.parcelDiagnostic.mod.ThrowableDiagnostic
    - typings.parcelDiagnostic.mod.PrintableError
    - js.Error
    - java.lang.String
  */
  type Diagnostifiable = _Diagnostifiable | js.Array[Diagnostic] | js.Error | String
  
  trait PrintableError
    extends StObject
       with Error
       with _Diagnostifiable {
    
    var codeFrame: js.UndefOr[String] = js.undefined
    
    var fileName: js.UndefOr[String] = js.undefined
    
    var filePath: js.UndefOr[String] = js.undefined
    
    var highlightedCodeFrame: js.UndefOr[String] = js.undefined
    
    var loc: js.UndefOr[Column | Null] = js.undefined
    
    var source: js.UndefOr[String] = js.undefined
  }
  object PrintableError {
    
    inline def apply(message: String, name: String): PrintableError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrintableError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrintableError] (val x: Self) extends AnyVal {
      
      inline def setCodeFrame(value: String): Self = StObject.set(x, "codeFrame", value.asInstanceOf[js.Any])
      
      inline def setCodeFrameUndefined: Self = StObject.set(x, "codeFrame", js.undefined)
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
      
      inline def setHighlightedCodeFrame(value: String): Self = StObject.set(x, "highlightedCodeFrame", value.asInstanceOf[js.Any])
      
      inline def setHighlightedCodeFrameUndefined: Self = StObject.set(x, "highlightedCodeFrame", js.undefined)
      
      inline def setLoc(value: Column): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
      
      inline def setLocNull: Self = StObject.set(x, "loc", null)
      
      inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  type TemplateInput = Any
  
  trait ThrowableDiagnostic
    extends StObject
       with Error
       with _Diagnostifiable {
    
    var diagnostics: js.Array[Diagnostic]
  }
  object ThrowableDiagnostic {
    
    inline def apply(diagnostics: js.Array[Diagnostic], message: String, name: String): ThrowableDiagnostic = {
      val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThrowableDiagnostic]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ThrowableDiagnostic] (val x: Self) extends AnyVal {
      
      inline def setDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
      
      inline def setDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value*))
    }
  }
  
  trait ThrowableDiagnosticOpts extends StObject {
    
    var diagnostic: Diagnostic | js.Array[Diagnostic]
  }
  object ThrowableDiagnosticOpts {
    
    inline def apply(diagnostic: Diagnostic | js.Array[Diagnostic]): ThrowableDiagnosticOpts = {
      val __obj = js.Dynamic.literal(diagnostic = diagnostic.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThrowableDiagnosticOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ThrowableDiagnosticOpts] (val x: Self) extends AnyVal {
      
      inline def setDiagnostic(value: Diagnostic | js.Array[Diagnostic]): Self = StObject.set(x, "diagnostic", value.asInstanceOf[js.Any])
      
      inline def setDiagnosticVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnostic", js.Array(value*))
    }
  }
  
  trait _Diagnostifiable extends StObject
  object _Diagnostifiable {
    
    inline def Diagnostic(message: String): typings.parcelDiagnostic.mod.Diagnostic = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.parcelDiagnostic.mod.Diagnostic]
    }
    
    inline def PrintableError(message: String, name: String): typings.parcelDiagnostic.mod.PrintableError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.parcelDiagnostic.mod.PrintableError]
    }
    
    inline def ThrowableDiagnostic(diagnostics: js.Array[Diagnostic], message: String, name: String): typings.parcelDiagnostic.mod.ThrowableDiagnostic = {
      val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.parcelDiagnostic.mod.ThrowableDiagnostic]
    }
  }
}
