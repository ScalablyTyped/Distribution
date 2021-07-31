package typings.novaEditorNode

import typings.novaEditorNode.anon.Args
import typings.novaEditorNode.anon.Cwd
import typings.novaEditorNode.anon.DataProvider
import typings.novaEditorNode.anon.Env
import typings.novaEditorNode.anon.InitializationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /// https://novadocs.panic.com/api-reference/charset/
  @JSGlobal("Charset")
  @js.native
  class Charset ()
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
    @scala.inline
    def alphanumeric_=(x: typings.novaEditorNode.Charset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alphanumeric")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Charset.digits")
    @js.native
    def digits: typings.novaEditorNode.Charset = js.native
    @scala.inline
    def digits_=(x: typings.novaEditorNode.Charset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("digits")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Charset.letters")
    @js.native
    def letters: typings.novaEditorNode.Charset = js.native
    @scala.inline
    def letters_=(x: typings.novaEditorNode.Charset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("letters")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Charset.lower")
    @js.native
    def lower: typings.novaEditorNode.Charset = js.native
    @scala.inline
    def lower_=(x: typings.novaEditorNode.Charset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lower")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Charset.newlines")
    @js.native
    def newlines: typings.novaEditorNode.Charset = js.native
    @scala.inline
    def newlines_=(x: typings.novaEditorNode.Charset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("newlines")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Charset.symbols")
    @js.native
    def symbols: typings.novaEditorNode.Charset = js.native
    @scala.inline
    def symbols_=(x: typings.novaEditorNode.Charset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symbols")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Charset.upper")
    @js.native
    def upper: typings.novaEditorNode.Charset = js.native
    @scala.inline
    def upper_=(x: typings.novaEditorNode.Charset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("upper")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Charset.whitespace")
    @js.native
    def whitespace: typings.novaEditorNode.Charset = js.native
    
    /* static member */
    @JSGlobal("Charset.whitespaceAndNewlines")
    @js.native
    def whitespaceAndNewlines: typings.novaEditorNode.Charset = js.native
    @scala.inline
    def whitespaceAndNewlines_=(x: typings.novaEditorNode.Charset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("whitespaceAndNewlines")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def whitespace_=(x: typings.novaEditorNode.Charset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("whitespace")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Color")
  @js.native
  class Color protected ()
    extends StObject
       with typings.novaEditorNode.Color {
    def this(format: ColorFormat, components: ColorComponents) = this()
    
    /* CompleteClass */
    var components: ColorComponents = js.native
    
    /* CompleteClass */
    var format: ColorFormat = js.native
  }
  
  /// https://novadocs.panic.com/api-reference/completion-item/
  @JSGlobal("CompletionItem")
  @js.native
  class CompletionItem protected ()
    extends StObject
       with typings.novaEditorNode.CompletionItem {
    def this(label: String, kind: CompletionItemKind) = this()
    
    /* CompleteClass */
    var kind: CompletionItemKind = js.native
    
    /* CompleteClass */
    var label: String = js.native
  }
  
  @JSGlobal("CompletionItemKind")
  @js.native
  object CompletionItemKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.novaEditorNode.CompletionItemKind & Double] = js.native
    
    /* 14 */ val Argument: typings.novaEditorNode.CompletionItemKind.Argument & Double = js.native
    
    /* 2 */ val Category: typings.novaEditorNode.CompletionItemKind.Category & Double = js.native
    
    /* 1 */ val Class: typings.novaEditorNode.CompletionItemKind.Class & Double = js.native
    
    /* 9 */ val Closure: typings.novaEditorNode.CompletionItemKind.Closure & Double = js.native
    
    /* 15 */ val Color: typings.novaEditorNode.CompletionItemKind.Color & Double = js.native
    
    /* 11 */ val Constant: typings.novaEditorNode.CompletionItemKind.Constant & Double = js.native
    
    /* 10 */ val Constructor: typings.novaEditorNode.CompletionItemKind.Constructor & Double = js.native
    
    /* 4 */ val Enum: typings.novaEditorNode.CompletionItemKind.Enum & Double = js.native
    
    /* 16 */ val EnumMember: typings.novaEditorNode.CompletionItemKind.EnumMember & Double = js.native
    
    /* 18 */ val Expression: typings.novaEditorNode.CompletionItemKind.Expression & Double = js.native
    
    /* 21 */ val File: typings.novaEditorNode.CompletionItemKind.File & Double = js.native
    
    /* 7 */ val Function: typings.novaEditorNode.CompletionItemKind.Function & Double = js.native
    
    /* 3 */ val Interface: typings.novaEditorNode.CompletionItemKind.Interface & Double = js.native
    
    /* 23 */ val Keyword: typings.novaEditorNode.CompletionItemKind.Keyword & Double = js.native
    
    /* 8 */ val Method: typings.novaEditorNode.CompletionItemKind.Method & Double = js.native
    
    /* 20 */ val Package: typings.novaEditorNode.CompletionItemKind.Package & Double = js.native
    
    /* 13 */ val Property: typings.novaEditorNode.CompletionItemKind.Property & Double = js.native
    
    /* 22 */ val Reference: typings.novaEditorNode.CompletionItemKind.Reference & Double = js.native
    
    /* 17 */ val Statement: typings.novaEditorNode.CompletionItemKind.Statement & Double = js.native
    
    /* 6 */ val Struct: typings.novaEditorNode.CompletionItemKind.Struct & Double = js.native
    
    /* 27 */ val StyleClass: typings.novaEditorNode.CompletionItemKind.StyleClass & Double = js.native
    
    /* 25 */ val StyleDirective: typings.novaEditorNode.CompletionItemKind.StyleDirective & Double = js.native
    
    /* 26 */ val StyleID: typings.novaEditorNode.CompletionItemKind.StyleID & Double = js.native
    
    /* 24 */ val StyleRuleset: typings.novaEditorNode.CompletionItemKind.StyleRuleset & Double = js.native
    
    /* 19 */ val Tag: typings.novaEditorNode.CompletionItemKind.Tag & Double = js.native
    
    /* 0 */ val Type: typings.novaEditorNode.CompletionItemKind.Type & Double = js.native
    
    /* 5 */ val Union: typings.novaEditorNode.CompletionItemKind.Union & Double = js.native
    
    /* 12 */ val Variable: typings.novaEditorNode.CompletionItemKind.Variable & Double = js.native
  }
  
  @JSGlobal("CompletionReason")
  @js.native
  object CompletionReason extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.novaEditorNode.CompletionReason & Double] = js.native
    
    /* 1 */ val Character: typings.novaEditorNode.CompletionReason.Character & Double = js.native
    
    /* 0 */ val Invoke: typings.novaEditorNode.CompletionReason.Invoke & Double = js.native
  }
  
  /// https://novadocs.panic.com/api-reference/composite-disposable/
  @JSGlobal("CompositeDisposable")
  @js.native
  class CompositeDisposable ()
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
  
  /// https://novadocs.panic.com/api-reference/disposable/
  @JSGlobal("Disposable")
  @js.native
  class Disposable ()
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
    @scala.inline
    def isDisposable(x: js.Any): /* is nova-editor-node.Disposable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDisposable")(x.asInstanceOf[js.Any]).asInstanceOf[/* is nova-editor-node.Disposable */ Boolean]
  }
  
  /// https://novadocs.panic.com/api-reference/emitter/
  @JSGlobal("Emitter")
  @js.native
  class Emitter ()
    extends StObject
       with typings.novaEditorNode.Emitter {
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
  }
  
  @JSGlobal("FileSystem")
  @js.native
  class FileSystem protected ()
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
  
  /// https://novadocs.panic.com/api-reference/issue/
  @JSGlobal("Issue")
  @js.native
  class Issue ()
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
  
  /// https://novadocs.panic.com/api-reference/issue-collection/
  @JSGlobal("IssueCollection")
  @js.native
  class IssueCollection ()
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
  
  /// https://novadocs.panic.com/api-reference/issue-parser/
  @JSGlobal("IssueParser")
  @js.native
  class IssueParser ()
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
  
  /// https://novadocs.panic.com/api-reference/language-client/
  @JSGlobal("LanguageClient")
  @js.native
  class LanguageClient protected ()
    extends StObject
       with typings.novaEditorNode.LanguageClient {
    def this(identifier: String, name: String, serverOptions: Args, clientOptions: InitializationOptions) = this()
  }
  
  /// https://novadocs.panic.com/api-reference/notification-request/
  @JSGlobal("NotificationRequest")
  @js.native
  class NotificationRequest protected ()
    extends StObject
       with typings.novaEditorNode.NotificationRequest {
    def this(identifier: String) = this()
    
    /* CompleteClass */
    override val identifier: String = js.native
  }
  
  /// https://novadocs.panic.com/api-reference/process/
  // This could be improved to split into automatic pipe and jsonrpc types with
  // the appropriate methods enabled, but because stdio is configured within
  // options it feels like overkill
  @JSGlobal("Process")
  @js.native
  class Process protected ()
    extends StObject
       with typings.novaEditorNode.Process {
    def this(command: String) = this()
    def this(command: String, options: Cwd) = this()
  }
  
  /// https://novadocs.panic.com/api-reference/range/
  @JSGlobal("Range")
  @js.native
  class Range protected ()
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
  
  /// https://novadocs.panic.com/api-reference/scanner/
  @JSGlobal("Scanner")
  @js.native
  class Scanner protected ()
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
  class Task protected ()
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
  
  /// https://docs.nova.app/api-reference/task-process-action/
  @JSGlobal("TaskProcessAction")
  @js.native
  class TaskProcessAction protected ()
    extends StObject
       with typings.novaEditorNode.TaskProcessAction {
    def this(command: String) = this()
    def this(command: String, options: Env) = this()
  }
  
  /// https://docs.nova.app/api-reference/text-edit/
  @JSGlobal("TextEdit")
  @js.native
  class TextEdit protected ()
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
    @scala.inline
    def delete(range: typings.novaEditorNode.Range): typings.novaEditorNode.TextEdit = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")(range.asInstanceOf[js.Any]).asInstanceOf[typings.novaEditorNode.TextEdit]
    
    /* static member */
    @scala.inline
    def insert(position: Double, newText: String): typings.novaEditorNode.TextEdit = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(position.asInstanceOf[js.Any], newText.asInstanceOf[js.Any])).asInstanceOf[typings.novaEditorNode.TextEdit]
    
    /* static member */
    @scala.inline
    def replace(range: typings.novaEditorNode.Range, newText: String): typings.novaEditorNode.TextEdit = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(range.asInstanceOf[js.Any], newText.asInstanceOf[js.Any])).asInstanceOf[typings.novaEditorNode.TextEdit]
  }
  
  /// https://novadocs.panic.com/api-reference/text-editor/
  @JSGlobal("TextEditor")
  @js.native
  class TextEditor protected ()
    extends StObject
       with typings.novaEditorNode.TextEditor
  object TextEditor {
    
    @JSGlobal("TextEditor")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @scala.inline
    def isTextEditor(`object`: js.Any): /* is nova-editor-node.TextEditor */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTextEditor")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is nova-editor-node.TextEditor */ Boolean]
  }
  
  /// https://novadocs.panic.com/api-reference/tree-item/
  @JSGlobal("TreeItem")
  @js.native
  class TreeItem protected ()
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
  
  /// https://novadocs.panic.com/api-reference/tree-view/
  @JSGlobal("TreeView")
  @js.native
  class TreeView[E] protected ()
    extends StObject
       with typings.novaEditorNode.TreeView[E] {
    def this(identifier: String) = this()
    def this(identifier: String, options: DataProvider[E]) = this()
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
  }
  
  /// https://novadocs.panic.com/api-reference/
  @scala.inline
  def atob(data: String): String = js.Dynamic.global.applyDynamic("atob")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def btoa(data: String): String = js.Dynamic.global.applyDynamic("btoa")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def clearInterval(): Unit = js.Dynamic.global.applyDynamic("clearInterval")().asInstanceOf[Unit]
  @scala.inline
  def clearInterval(handle: Double): Unit = js.Dynamic.global.applyDynamic("clearInterval")(handle.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def clearTimeout(): Unit = js.Dynamic.global.applyDynamic("clearTimeout")().asInstanceOf[Unit]
  @scala.inline
  def clearTimeout(handle: Double): Unit = js.Dynamic.global.applyDynamic("clearTimeout")(handle.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSGlobal("nova")
  @js.native
  val nova: Environment = js.native
  
  @scala.inline
  def setInterval(handler: TimerHandler, timeout: Double, arguments: js.Any*): Double = (js.Dynamic.global.applyDynamic("setInterval")(handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], arguments.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def setInterval(handler: TimerHandler, timeout: Unit, arguments: js.Any*): Double = (js.Dynamic.global.applyDynamic("setInterval")(handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], arguments.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def setTimeout(handler: TimerHandler, timeout: Double, arguments: js.Any*): Double = (js.Dynamic.global.applyDynamic("setTimeout")(handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], arguments.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def setTimeout(handler: TimerHandler, timeout: Unit, arguments: js.Any*): Double = (js.Dynamic.global.applyDynamic("setTimeout")(handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], arguments.asInstanceOf[js.Any])).asInstanceOf[Double]
}
