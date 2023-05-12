package typings.novaEditorNode

import typings.novaEditorNode.anon.Args
import typings.novaEditorNode.anon.Cwd
import typings.novaEditorNode.anon.Data
import typings.novaEditorNode.anon.DataProvider
import typings.novaEditorNode.anon.InitializationOptions
import typings.novaEditorNode.anon.`1`
import typings.std.TimerHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /// https://docs.nova.app/api-reference/charset/
  @JSGlobal("Charset")
  @js.native
  open class Charset ()
    extends StObject
       with typings.novaEditorNode.Charset {
    def this(characters: String) = this()
    
    /* CompleteClass */
    override def concat(charsets: typings.novaEditorNode.Charset*): typings.novaEditorNode.Charset = js.native
    
    /* CompleteClass */
    override def intersect(charsets: typings.novaEditorNode.Charset*): typings.novaEditorNode.Charset = js.native
  }
  object Charset {
    
    @JSGlobal("Charset")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("Charset.alphanumeric")
    @js.native
    def alphanumeric: typings.novaEditorNode.Charset = js.native
    inline def alphanumeric_=(x: typings.novaEditorNode.Charset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alphanumeric")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Charset.digits")
    @js.native
    def digits: typings.novaEditorNode.Charset = js.native
    inline def digits_=(x: typings.novaEditorNode.Charset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("digits")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Charset.letters")
    @js.native
    def letters: typings.novaEditorNode.Charset = js.native
    inline def letters_=(x: typings.novaEditorNode.Charset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("letters")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Charset.lower")
    @js.native
    def lower: typings.novaEditorNode.Charset = js.native
    inline def lower_=(x: typings.novaEditorNode.Charset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lower")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Charset.newlines")
    @js.native
    def newlines: typings.novaEditorNode.Charset = js.native
    inline def newlines_=(x: typings.novaEditorNode.Charset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("newlines")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Charset.symbols")
    @js.native
    def symbols: typings.novaEditorNode.Charset = js.native
    inline def symbols_=(x: typings.novaEditorNode.Charset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symbols")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Charset.upper")
    @js.native
    def upper: typings.novaEditorNode.Charset = js.native
    inline def upper_=(x: typings.novaEditorNode.Charset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("upper")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Charset.whitespace")
    @js.native
    def whitespace: typings.novaEditorNode.Charset = js.native
    
    /* static member */
    @JSGlobal("Charset.whitespaceAndNewlines")
    @js.native
    def whitespaceAndNewlines: typings.novaEditorNode.Charset = js.native
    inline def whitespaceAndNewlines_=(x: typings.novaEditorNode.Charset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("whitespaceAndNewlines")(x.asInstanceOf[js.Any])
    
    inline def whitespace_=(x: typings.novaEditorNode.Charset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("whitespace")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Color")
  @js.native
  open class Color protected ()
    extends StObject
       with typings.novaEditorNode.Color {
    def this(format: ColorFormat, components: js.Array[Double]) = this()
    
    /* CompleteClass */
    override val components: js.Array[Double] = js.native
    
    /* CompleteClass */
    override def convert(format: ColorFormat): typings.novaEditorNode.Color = js.native
    
    /* CompleteClass */
    override val format: ColorFormat = js.native
  }
  object Color {
    
    @JSGlobal("Color")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def displayP3(red: Double, green: Double, blue: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("displayP3")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def displayP3(red: Double, green: Double, blue: Double, alpha: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("displayP3")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /* static member */
    inline def hsb(hue: Double, saturation: Double, brightness: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("hsb")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], brightness.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def hsb(hue: Double, saturation: Double, brightness: Double, alpha: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("hsb")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], brightness.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /* static member */
    inline def hsl(hue: Double, saturation: Double, luminance: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("hsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], luminance.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def hsl(hue: Double, saturation: Double, luminance: Double, alpha: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("hsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], luminance.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /* static member */
    inline def rgb(red: Double, green: Double, blue: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("rgb")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def rgb(red: Double, green: Double, blue: Double, alpha: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("rgb")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  /// https://docs.nova.app/api-reference/color/
  @JSGlobal("ColorFormat")
  @js.native
  object ColorFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.novaEditorNode.ColorFormat & String] = js.native
    
    /* "p3" */ val displayP3: typings.novaEditorNode.ColorFormat.displayP3 & String = js.native
    
    /* "hsb" */ val hsb: typings.novaEditorNode.ColorFormat.hsb & String = js.native
    
    /* "hsl" */ val hsl: typings.novaEditorNode.ColorFormat.hsl & String = js.native
    
    /* "rgb" */ val rgb: typings.novaEditorNode.ColorFormat.rgb & String = js.native
  }
  
  /// https://docs.nova.app/api-reference/color-information/
  @JSGlobal("ColorInformation")
  @js.native
  open class ColorInformation protected ()
    extends StObject
       with typings.novaEditorNode.ColorInformation {
    def this(range: typings.novaEditorNode.Range, color: typings.novaEditorNode.Color) = this()
    def this(range: typings.novaEditorNode.Range, color: typings.novaEditorNode.Color, kind: String) = this()
    
    /* CompleteClass */
    var color: typings.novaEditorNode.Color = js.native
    
    /* CompleteClass */
    var range: typings.novaEditorNode.Range = js.native
  }
  
  /// https://docs.nova.app/api-reference/color-presentation/
  @JSGlobal("ColorPresentation")
  @js.native
  open class ColorPresentation protected ()
    extends StObject
       with typings.novaEditorNode.ColorPresentation {
    def this(label: String) = this()
    def this(label: String, kind: String) = this()
    
    /* CompleteClass */
    var additionalTextEdits: js.Array[typings.novaEditorNode.TextEdit] = js.native
    
    /* CompleteClass */
    var kind: String = js.native
    
    /* CompleteClass */
    var label: String = js.native
  }
  
  /// https://docs.nova.app/api-reference/completion-item/
  @JSGlobal("CompletionItem")
  @js.native
  open class CompletionItem protected ()
    extends StObject
       with typings.novaEditorNode.CompletionItem {
    def this(label: String, kind: CompletionItemKind) = this()
    
    /* CompleteClass */
    override val kind: CompletionItemKind = js.native
    
    /* CompleteClass */
    override val label: String = js.native
  }
  
  @JSGlobal("CompletionItemKind")
  @js.native
  object CompletionItemKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.novaEditorNode.CompletionItemKind & Double] = js.native
    
    /* 18 */ val Argument: typings.novaEditorNode.CompletionItemKind.Argument & Double = js.native
    
    /* 2 */ val Category: typings.novaEditorNode.CompletionItemKind.Category & Double = js.native
    
    /* 1 */ val Class: typings.novaEditorNode.CompletionItemKind.Class & Double = js.native
    
    /* 9 */ val Closure: typings.novaEditorNode.CompletionItemKind.Closure & Double = js.native
    
    /* 19 */ val Color: typings.novaEditorNode.CompletionItemKind.Color & Double = js.native
    
    /* 15 */ val Constant: typings.novaEditorNode.CompletionItemKind.Constant & Double = js.native
    
    /* 10 */ val Constructor: typings.novaEditorNode.CompletionItemKind.Constructor & Double = js.native
    
    /* 11 */ val Destructor: typings.novaEditorNode.CompletionItemKind.Destructor & Double = js.native
    
    /* 4 */ val Enum: typings.novaEditorNode.CompletionItemKind.Enum & Double = js.native
    
    /* 20 */ val EnumMember: typings.novaEditorNode.CompletionItemKind.EnumMember & Double = js.native
    
    /* 22 */ val Expression: typings.novaEditorNode.CompletionItemKind.Expression & Double = js.native
    
    /* 25 */ val File: typings.novaEditorNode.CompletionItemKind.File & Double = js.native
    
    /* 7 */ val Function: typings.novaEditorNode.CompletionItemKind.Function & Double = js.native
    
    /* 12 */ val Getter: typings.novaEditorNode.CompletionItemKind.Getter & Double = js.native
    
    /* 3 */ val Interface: typings.novaEditorNode.CompletionItemKind.Interface & Double = js.native
    
    /* 27 */ val Keyword: typings.novaEditorNode.CompletionItemKind.Keyword & Double = js.native
    
    /* 8 */ val Method: typings.novaEditorNode.CompletionItemKind.Method & Double = js.native
    
    /* 24 */ val Package: typings.novaEditorNode.CompletionItemKind.Package & Double = js.native
    
    /* 17 */ val Property: typings.novaEditorNode.CompletionItemKind.Property & Double = js.native
    
    /* 26 */ val Reference: typings.novaEditorNode.CompletionItemKind.Reference & Double = js.native
    
    /* 13 */ val Setter: typings.novaEditorNode.CompletionItemKind.Setter & Double = js.native
    
    /* 23 */ val Statement: typings.novaEditorNode.CompletionItemKind.Statement & Double = js.native
    
    /* 14 */ val StaticMethod: typings.novaEditorNode.CompletionItemKind.StaticMethod & Double = js.native
    
    /* 21 */ val StaticProperty: typings.novaEditorNode.CompletionItemKind.StaticProperty & Double = js.native
    
    /* 6 */ val Struct: typings.novaEditorNode.CompletionItemKind.Struct & Double = js.native
    
    /* 31 */ val StyleClass: typings.novaEditorNode.CompletionItemKind.StyleClass & Double = js.native
    
    /* 29 */ val StyleDirective: typings.novaEditorNode.CompletionItemKind.StyleDirective & Double = js.native
    
    /* 30 */ val StyleID: typings.novaEditorNode.CompletionItemKind.StyleID & Double = js.native
    
    /* 32 */ val StylePseudoClass: typings.novaEditorNode.CompletionItemKind.StylePseudoClass & Double = js.native
    
    /* 33 */ val StylePseudoElement: typings.novaEditorNode.CompletionItemKind.StylePseudoElement & Double = js.native
    
    /* 28 */ val StyleRuleset: typings.novaEditorNode.CompletionItemKind.StyleRuleset & Double = js.native
    
    /* 34 */ val Tag: typings.novaEditorNode.CompletionItemKind.Tag & Double = js.native
    
    /* 48 */ val TagAnchor: typings.novaEditorNode.CompletionItemKind.TagAnchor & Double = js.native
    
    /* 39 */ val TagBody: typings.novaEditorNode.CompletionItemKind.TagBody & Double = js.native
    
    /* 44 */ val TagContainer: typings.novaEditorNode.CompletionItemKind.TagContainer & Double = js.native
    
    /* 51 */ val TagForm: typings.novaEditorNode.CompletionItemKind.TagForm & Double = js.native
    
    /* 52 */ val TagFormField: typings.novaEditorNode.CompletionItemKind.TagFormField & Double = js.native
    
    /* 53 */ val TagFramework: typings.novaEditorNode.CompletionItemKind.TagFramework & Double = js.native
    
    /* 35 */ val TagHead: typings.novaEditorNode.CompletionItemKind.TagHead & Double = js.native
    
    /* 42 */ val TagHeading: typings.novaEditorNode.CompletionItemKind.TagHeading & Double = js.native
    
    /* 49 */ val TagImage: typings.novaEditorNode.CompletionItemKind.TagImage & Double = js.native
    
    /* 38 */ val TagLink: typings.novaEditorNode.CompletionItemKind.TagLink & Double = js.native
    
    /* 47 */ val TagListItem: typings.novaEditorNode.CompletionItemKind.TagListItem & Double = js.native
    
    /* 50 */ val TagMedia: typings.novaEditorNode.CompletionItemKind.TagMedia & Double = js.native
    
    /* 37 */ val TagMeta: typings.novaEditorNode.CompletionItemKind.TagMeta & Double = js.native
    
    /* 46 */ val TagOrderedList: typings.novaEditorNode.CompletionItemKind.TagOrderedList & Double = js.native
    
    /* 40 */ val TagScript: typings.novaEditorNode.CompletionItemKind.TagScript & Double = js.native
    
    /* 43 */ val TagSection: typings.novaEditorNode.CompletionItemKind.TagSection & Double = js.native
    
    /* 41 */ val TagStyle: typings.novaEditorNode.CompletionItemKind.TagStyle & Double = js.native
    
    /* 36 */ val TagTitle: typings.novaEditorNode.CompletionItemKind.TagTitle & Double = js.native
    
    /* 45 */ val TagUnorderedList: typings.novaEditorNode.CompletionItemKind.TagUnorderedList & Double = js.native
    
    /* 0 */ val Type: typings.novaEditorNode.CompletionItemKind.Type & Double = js.native
    
    /* 5 */ val Union: typings.novaEditorNode.CompletionItemKind.Union & Double = js.native
    
    /* 16 */ val Variable: typings.novaEditorNode.CompletionItemKind.Variable & Double = js.native
  }
  
  @JSGlobal("CompletionReason")
  @js.native
  object CompletionReason extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.novaEditorNode.CompletionReason & Double] = js.native
    
    /* 1 */ val Character: typings.novaEditorNode.CompletionReason.Character & Double = js.native
    
    /* 0 */ val Invoke: typings.novaEditorNode.CompletionReason.Invoke & Double = js.native
  }
  
  /// https://docs.nova.app/api-reference/composite-disposable/
  @JSGlobal("CompositeDisposable")
  @js.native
  open class CompositeDisposable ()
    extends StObject
       with typings.novaEditorNode.CompositeDisposable {
    
    /* CompleteClass */
    override def add(`object`: typings.novaEditorNode.Disposable): Unit = js.native
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def delete(`object`: typings.novaEditorNode.Disposable): Unit = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def remove(`object`: typings.novaEditorNode.Disposable): Unit = js.native
  }
  
  /// https://docs.nova.app/api-reference/disposable/
  @JSGlobal("Disposable")
  @js.native
  open class Disposable ()
    extends StObject
       with typings.novaEditorNode.Disposable {
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
  }
  object Disposable {
    
    @JSGlobal("Disposable")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def isDisposable(x: Any): /* is nova-editor-node.Disposable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDisposable")(x.asInstanceOf[js.Any]).asInstanceOf[/* is nova-editor-node.Disposable */ Boolean]
  }
  
  /// https://docs.nova.app/api-reference/emitter/
  @JSGlobal("Emitter")
  @js.native
  open class Emitter ()
    extends StObject
       with typings.novaEditorNode.Emitter {
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
  }
  
  @JSGlobal("FileSystem")
  @js.native
  /* private */ open class FileSystem ()
    extends StObject
       with typings.novaEditorNode.FileSystem
  
  @JSGlobal("InsertTextFormat")
  @js.native
  object InsertTextFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.novaEditorNode.InsertTextFormat & Double] = js.native
    
    /* 0 */ val PlainText: typings.novaEditorNode.InsertTextFormat.PlainText & Double = js.native
    
    /* 1 */ val Snippet: typings.novaEditorNode.InsertTextFormat.Snippet & Double = js.native
  }
  
  /// https://docs.nova.app/api-reference/issue/
  @JSGlobal("Issue")
  @js.native
  open class Issue ()
    extends StObject
       with typings.novaEditorNode.Issue {
    
    /* CompleteClass */
    var code: Double | String = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var severity: IssueSeverity = js.native
    
    /* CompleteClass */
    var source: String | Null = js.native
  }
  
  /// https://docs.nova.app/api-reference/issue-collection/
  @JSGlobal("IssueCollection")
  @js.native
  open class IssueCollection ()
    extends StObject
       with typings.novaEditorNode.IssueCollection {
    def this(name: String) = this()
    
    /* CompleteClass */
    override def append(uri: String, issues: js.Array[typings.novaEditorNode.Issue]): Unit = js.native
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def get(uri: String): js.Array[typings.novaEditorNode.Issue] = js.native
    
    /* CompleteClass */
    override def has(uri: String): Boolean = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    override def remove(uri: String): Unit = js.native
    
    /* CompleteClass */
    override def set(uri: String, issues: js.Array[typings.novaEditorNode.Issue]): Unit = js.native
  }
  
  /// https://docs.nova.app/api-reference/issue-parser/
  @JSGlobal("IssueParser")
  @js.native
  open class IssueParser ()
    extends StObject
       with typings.novaEditorNode.IssueParser {
    def this(matcherNames: String) = this()
    def this(matcherNames: js.Array[String]) = this()
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override val issues: js.Array[typings.novaEditorNode.Issue] = js.native
    
    /* CompleteClass */
    override def pushLine(line: String): Unit = js.native
  }
  
  @JSGlobal("IssueSeverity")
  @js.native
  object IssueSeverity extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.novaEditorNode.IssueSeverity & Double] = js.native
    
    /* 0 */ val Error: typings.novaEditorNode.IssueSeverity.Error & Double = js.native
    
    /* 2 */ val Hint: typings.novaEditorNode.IssueSeverity.Hint & Double = js.native
    
    /* 3 */ val Info: typings.novaEditorNode.IssueSeverity.Info & Double = js.native
    
    /* 1 */ val Warning: typings.novaEditorNode.IssueSeverity.Warning & Double = js.native
  }
  
  /// https://docs.nova.app/api-reference/language-client/
  @JSGlobal("LanguageClient")
  @js.native
  open class LanguageClient protected ()
    extends StObject
       with typings.novaEditorNode.LanguageClient {
    def this(
      identifier: String,
      name: String,
      serverOptions: ServerOptions,
      clientOptions: InitializationOptions
    ) = this()
  }
  
  /// https://docs.nova.app/api-reference/notification-request/
  @JSGlobal("NotificationRequest")
  @js.native
  open class NotificationRequest ()
    extends StObject
       with typings.novaEditorNode.NotificationRequest {
    def this(identifier: String) = this()
    
    /* CompleteClass */
    override val identifier: String = js.native
  }
  
  /// https://docs.nova.app/api-reference/process/
  // This could be improved to split into automatic pipe and jsonrpc types with
  // the appropriate methods enabled, but because stdio is configured within
  // options it feels like overkill
  @JSGlobal("Process")
  @js.native
  open class Process protected ()
    extends StObject
       with typings.novaEditorNode.Process {
    def this(command: String) = this()
    def this(command: String, options: Args) = this()
  }
  
  /// https://docs.nova.app/api-reference/range/
  @JSGlobal("Range")
  @js.native
  open class Range protected ()
    extends StObject
       with typings.novaEditorNode.Range {
    def this(start: Double, end: Double) = this()
    
    /* CompleteClass */
    override def compare(other: typings.novaEditorNode.Range): Double = js.native
    
    /* CompleteClass */
    override def containsIndex(index: Double): Boolean = js.native
    
    /* CompleteClass */
    override def containsRange(other: typings.novaEditorNode.Range): Boolean = js.native
    
    /* CompleteClass */
    var empty: Boolean = js.native
    
    /* CompleteClass */
    var end: Double = js.native
    
    /* CompleteClass */
    override def intersection(other: typings.novaEditorNode.Range): typings.novaEditorNode.Range = js.native
    
    /* CompleteClass */
    override def intersectsRange(other: typings.novaEditorNode.Range): Boolean = js.native
    
    /* CompleteClass */
    override def isEqual(other: typings.novaEditorNode.Range): Boolean = js.native
    
    /* CompleteClass */
    var length: Double = js.native
    
    /* CompleteClass */
    var start: Double = js.native
    
    /* CompleteClass */
    override def union(other: typings.novaEditorNode.Range): typings.novaEditorNode.Range = js.native
  }
  
  /// https://docs.nova.app/api-reference/scanner/
  @JSGlobal("Scanner")
  @js.native
  open class Scanner protected ()
    extends StObject
       with typings.novaEditorNode.Scanner {
    def this(string: String) = this()
    
    /* CompleteClass */
    override val atEnd: Boolean = js.native
    
    /* CompleteClass */
    var caseSensitive: Boolean = js.native
    
    /* CompleteClass */
    var location: Double = js.native
    
    /* CompleteClass */
    override def scanChars(charset: typings.novaEditorNode.Charset): String | Null = js.native
    
    /* CompleteClass */
    override def scanFloat(): Double | Null = js.native
    
    /* CompleteClass */
    override def scanHexFloat(): Double | Null = js.native
    
    /* CompleteClass */
    override def scanHexInt(): Double | Null = js.native
    
    /* CompleteClass */
    override def scanInt(): Double | Null = js.native
    
    /* CompleteClass */
    override def scanString(string: String): String | Null = js.native
    
    /* CompleteClass */
    override def scanUpToChars(charset: typings.novaEditorNode.Charset): String | Null = js.native
    
    /* CompleteClass */
    override def scanUpToString(string: String): String | Null = js.native
    
    /* CompleteClass */
    var skipChars: typings.novaEditorNode.Charset = js.native
    
    /* CompleteClass */
    override val string: String = js.native
  }
  
  @JSGlobal("Task")
  @js.native
  open class Task protected ()
    extends StObject
       with typings.novaEditorNode.Task {
    def this(name: String) = this()
  }
  object Task {
    
    /* static member */
    @JSGlobal("Task.Build")
    @js.native
    val Build: TaskName = js.native
    
    /* static member */
    @JSGlobal("Task.Clean")
    @js.native
    val Clean: TaskName = js.native
    
    /* static member */
    @JSGlobal("Task.Run")
    @js.native
    val Run: TaskName = js.native
  }
  
  /// https://docs.nova.app/api-reference/task-command-action/
  @JSGlobal("TaskCommandAction")
  @js.native
  open class TaskCommandAction protected ()
    extends StObject
       with typings.novaEditorNode.TaskCommandAction {
    def this(command: String) = this()
    def this(command: String, options: `1`) = this()
    
    /* CompleteClass */
    override val args: js.Array[String] = js.native
    
    /* CompleteClass */
    override val command: String = js.native
  }
  
  /// https://docs.nova.app/api-reference/task-process-action/
  @JSGlobal("TaskProcessAction")
  @js.native
  open class TaskProcessAction protected ()
    extends StObject
       with typings.novaEditorNode.TaskProcessAction {
    def this(command: String) = this()
    def this(command: String, options: Cwd) = this()
  }
  
  /// https://docs.nova.app/api-reference/task-resolvable-action/
  @JSGlobal("TaskResolvableAction")
  @js.native
  open class TaskResolvableAction[T /* <: Transferrable */] ()
    extends StObject
       with typings.novaEditorNode.TaskResolvableAction[T] {
    def this(options: Data[T]) = this()
    
    /* CompleteClass */
    override val data: T = js.native
  }
  
  /// https://docs.nova.app/api-reference/text-edit/
  @JSGlobal("TextEdit")
  @js.native
  open class TextEdit protected ()
    extends StObject
       with typings.novaEditorNode.TextEdit {
    def this(range: typings.novaEditorNode.Range, newText: String) = this()
    
    /* CompleteClass */
    override val newText: String = js.native
    
    /* CompleteClass */
    override val range: typings.novaEditorNode.Range = js.native
  }
  object TextEdit {
    
    @JSGlobal("TextEdit")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def delete(range: typings.novaEditorNode.Range): typings.novaEditorNode.TextEdit = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")(range.asInstanceOf[js.Any]).asInstanceOf[typings.novaEditorNode.TextEdit]
    
    /* static member */
    inline def insert(position: Double, newText: String): typings.novaEditorNode.TextEdit = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(position.asInstanceOf[js.Any], newText.asInstanceOf[js.Any])).asInstanceOf[typings.novaEditorNode.TextEdit]
    
    /* static member */
    inline def replace(range: typings.novaEditorNode.Range, newText: String): typings.novaEditorNode.TextEdit = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(range.asInstanceOf[js.Any], newText.asInstanceOf[js.Any])).asInstanceOf[typings.novaEditorNode.TextEdit]
  }
  
  /// https://docs.nova.app/api-reference/text-editor/
  @JSGlobal("TextEditor")
  @js.native
  /* private */ open class TextEditor ()
    extends StObject
       with typings.novaEditorNode.TextEditor
  object TextEditor {
    
    @JSGlobal("TextEditor")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def isTextEditor(`object`: Any): /* is nova-editor-node.TextEditor */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTextEditor")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is nova-editor-node.TextEditor */ Boolean]
  }
  
  /// https://docs.nova.app/api-reference/tree-item/
  @JSGlobal("TreeItem")
  @js.native
  open class TreeItem protected ()
    extends StObject
       with typings.novaEditorNode.TreeItem {
    def this(name: String) = this()
    def this(name: String, collapsibleState: TreeItemCollapsibleState) = this()
    
    /* CompleteClass */
    var collapsibleState: TreeItemCollapsibleState = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSGlobal("TreeItemCollapsibleState")
  @js.native
  object TreeItemCollapsibleState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.novaEditorNode.TreeItemCollapsibleState & Double] = js.native
    
    /* 1 */ val Collapsed: typings.novaEditorNode.TreeItemCollapsibleState.Collapsed & Double = js.native
    
    /* 2 */ val Expanded: typings.novaEditorNode.TreeItemCollapsibleState.Expanded & Double = js.native
    
    /* 0 */ val None: typings.novaEditorNode.TreeItemCollapsibleState.None & Double = js.native
  }
  
  /// https://docs.nova.app/api-reference/tree-view/
  @JSGlobal("TreeView")
  @js.native
  open class TreeView[E] protected ()
    extends StObject
       with typings.novaEditorNode.TreeView[E] {
    def this(identifier: String) = this()
    def this(identifier: String, options: DataProvider[E]) = this()
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
  }
  
  /// https://docs.nova.app/api-reference/
  inline def atob(data: String): String = js.Dynamic.global.applyDynamic("atob")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def btoa(data: String): String = js.Dynamic.global.applyDynamic("btoa")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def clearInterval(): Unit = js.Dynamic.global.applyDynamic("clearInterval")().asInstanceOf[Unit]
  inline def clearInterval(handle: Double): Unit = js.Dynamic.global.applyDynamic("clearInterval")(handle.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def clearTimeout(): Unit = js.Dynamic.global.applyDynamic("clearTimeout")().asInstanceOf[Unit]
  inline def clearTimeout(handle: Double): Unit = js.Dynamic.global.applyDynamic("clearTimeout")(handle.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSGlobal("nova")
  @js.native
  val nova: Environment = js.native
  
  inline def setInterval(handler: TimerHandler, timeout: Double, arguments: Any*): Double = (js.Dynamic.global.applyDynamic("setInterval")((scala.List(handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).`++`(arguments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Double]
  inline def setInterval(handler: TimerHandler, timeout: Unit, arguments: Any*): Double = (js.Dynamic.global.applyDynamic("setInterval")((scala.List(handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).`++`(arguments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Double]
  
  inline def setTimeout(handler: TimerHandler, timeout: Double, arguments: Any*): Double = (js.Dynamic.global.applyDynamic("setTimeout")((scala.List(handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).`++`(arguments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Double]
  inline def setTimeout(handler: TimerHandler, timeout: Unit, arguments: Any*): Double = (js.Dynamic.global.applyDynamic("setTimeout")((scala.List(handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).`++`(arguments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Double]
}
