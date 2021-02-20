package typings.novaEditorNode

import typings.novaEditorNode.anon.Args
import typings.novaEditorNode.anon.Cwd
import typings.novaEditorNode.anon.DataProvider
import typings.novaEditorNode.anon.Env
import typings.novaEditorNode.anon.InitializationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /// https://novadocs.panic.com/api-reference/charset/
  @JSGlobal("Charset")
  @js.native
  class Charset ()
    extends typings.novaEditorNode.Charset {
    def this(characters: String) = this()
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
    extends typings.novaEditorNode.Color {
    def this(format: ColorFormat, components: ColorComponents) = this()
  }
  
  /// https://novadocs.panic.com/api-reference/completion-item/
  @JSGlobal("CompletionItem")
  @js.native
  class CompletionItem protected ()
    extends typings.novaEditorNode.CompletionItem {
    def this(label: String, kind: CompletionItemKind) = this()
  }
  
  @JSGlobal("CompletionItemKind")
  @js.native
  object CompletionItemKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.novaEditorNode.CompletionItemKind with Double] = js.native
    
    /* 14 */ val Argument: typings.novaEditorNode.CompletionItemKind.Argument with Double = js.native
    
    /* 2 */ val Category: typings.novaEditorNode.CompletionItemKind.Category with Double = js.native
    
    /* 1 */ val Class: typings.novaEditorNode.CompletionItemKind.Class with Double = js.native
    
    /* 9 */ val Closure: typings.novaEditorNode.CompletionItemKind.Closure with Double = js.native
    
    /* 15 */ val Color: typings.novaEditorNode.CompletionItemKind.Color with Double = js.native
    
    /* 11 */ val Constant: typings.novaEditorNode.CompletionItemKind.Constant with Double = js.native
    
    /* 10 */ val Constructor: typings.novaEditorNode.CompletionItemKind.Constructor with Double = js.native
    
    /* 4 */ val Enum: typings.novaEditorNode.CompletionItemKind.Enum with Double = js.native
    
    /* 16 */ val EnumMember: typings.novaEditorNode.CompletionItemKind.EnumMember with Double = js.native
    
    /* 18 */ val Expression: typings.novaEditorNode.CompletionItemKind.Expression with Double = js.native
    
    /* 21 */ val File: typings.novaEditorNode.CompletionItemKind.File with Double = js.native
    
    /* 7 */ val Function: typings.novaEditorNode.CompletionItemKind.Function with Double = js.native
    
    /* 3 */ val Interface: typings.novaEditorNode.CompletionItemKind.Interface with Double = js.native
    
    /* 23 */ val Keyword: typings.novaEditorNode.CompletionItemKind.Keyword with Double = js.native
    
    /* 8 */ val Method: typings.novaEditorNode.CompletionItemKind.Method with Double = js.native
    
    /* 20 */ val Package: typings.novaEditorNode.CompletionItemKind.Package with Double = js.native
    
    /* 13 */ val Property: typings.novaEditorNode.CompletionItemKind.Property with Double = js.native
    
    /* 22 */ val Reference: typings.novaEditorNode.CompletionItemKind.Reference with Double = js.native
    
    /* 17 */ val Statement: typings.novaEditorNode.CompletionItemKind.Statement with Double = js.native
    
    /* 6 */ val Struct: typings.novaEditorNode.CompletionItemKind.Struct with Double = js.native
    
    /* 27 */ val StyleClass: typings.novaEditorNode.CompletionItemKind.StyleClass with Double = js.native
    
    /* 25 */ val StyleDirective: typings.novaEditorNode.CompletionItemKind.StyleDirective with Double = js.native
    
    /* 26 */ val StyleID: typings.novaEditorNode.CompletionItemKind.StyleID with Double = js.native
    
    /* 24 */ val StyleRuleset: typings.novaEditorNode.CompletionItemKind.StyleRuleset with Double = js.native
    
    /* 19 */ val Tag: typings.novaEditorNode.CompletionItemKind.Tag with Double = js.native
    
    /* 0 */ val Type: typings.novaEditorNode.CompletionItemKind.Type with Double = js.native
    
    /* 5 */ val Union: typings.novaEditorNode.CompletionItemKind.Union with Double = js.native
    
    /* 12 */ val Variable: typings.novaEditorNode.CompletionItemKind.Variable with Double = js.native
  }
  
  @JSGlobal("CompletionReason")
  @js.native
  object CompletionReason extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.novaEditorNode.CompletionReason with Double] = js.native
    
    /* 1 */ val Character: typings.novaEditorNode.CompletionReason.Character with Double = js.native
    
    /* 0 */ val Invoke: typings.novaEditorNode.CompletionReason.Invoke with Double = js.native
  }
  
  /// https://novadocs.panic.com/api-reference/composite-disposable/
  @JSGlobal("CompositeDisposable")
  @js.native
  class CompositeDisposable ()
    extends typings.novaEditorNode.CompositeDisposable
  
  /// https://novadocs.panic.com/api-reference/disposable/
  @JSGlobal("Disposable")
  @js.native
  class Disposable ()
    extends typings.novaEditorNode.Disposable
  object Disposable {
    
    /* static member */
    @JSGlobal("Disposable.isDisposable")
    @js.native
    def isDisposable(x: js.Any): /* is nova-editor-node.Disposable */ Boolean = js.native
  }
  
  /// https://novadocs.panic.com/api-reference/emitter/
  @JSGlobal("Emitter")
  @js.native
  class Emitter ()
    extends typings.novaEditorNode.Emitter
  
  @JSGlobal("FileSystem")
  @js.native
  class FileSystem protected ()
    extends typings.novaEditorNode.FileSystem
  
  @JSGlobal("InsertTextFormat")
  @js.native
  object InsertTextFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.novaEditorNode.InsertTextFormat with Double] = js.native
    
    /* 0 */ val PlainText: typings.novaEditorNode.InsertTextFormat.PlainText with Double = js.native
    
    /* 1 */ val Snippet: typings.novaEditorNode.InsertTextFormat.Snippet with Double = js.native
  }
  
  /// https://novadocs.panic.com/api-reference/issue/
  @JSGlobal("Issue")
  @js.native
  class Issue ()
    extends typings.novaEditorNode.Issue
  
  /// https://novadocs.panic.com/api-reference/issue-collection/
  @JSGlobal("IssueCollection")
  @js.native
  class IssueCollection ()
    extends typings.novaEditorNode.IssueCollection {
    def this(name: String) = this()
  }
  
  /// https://novadocs.panic.com/api-reference/issue-parser/
  @JSGlobal("IssueParser")
  @js.native
  class IssueParser ()
    extends typings.novaEditorNode.IssueParser {
    def this(matcherNames: String) = this()
    def this(matcherNames: js.Array[String]) = this()
  }
  
  @JSGlobal("IssueSeverity")
  @js.native
  object IssueSeverity extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.novaEditorNode.IssueSeverity with Double] = js.native
    
    /* 0 */ val Error: typings.novaEditorNode.IssueSeverity.Error with Double = js.native
    
    /* 2 */ val Hint: typings.novaEditorNode.IssueSeverity.Hint with Double = js.native
    
    /* 3 */ val Info: typings.novaEditorNode.IssueSeverity.Info with Double = js.native
    
    /* 1 */ val Warning: typings.novaEditorNode.IssueSeverity.Warning with Double = js.native
  }
  
  /// https://novadocs.panic.com/api-reference/language-client/
  @JSGlobal("LanguageClient")
  @js.native
  class LanguageClient protected ()
    extends typings.novaEditorNode.LanguageClient {
    def this(identifier: String, name: String, serverOptions: Args, clientOptions: InitializationOptions) = this()
  }
  
  /// https://novadocs.panic.com/api-reference/notification-request/
  @JSGlobal("NotificationRequest")
  @js.native
  class NotificationRequest protected ()
    extends typings.novaEditorNode.NotificationRequest {
    def this(identifier: String) = this()
  }
  
  /// https://novadocs.panic.com/api-reference/process/
  // This could be improved to split into automatic pipe and jsonrpc types with
  // the appropriate methods enabled, but because stdio is configured within
  // options it feels like overkill
  @JSGlobal("Process")
  @js.native
  class Process protected ()
    extends typings.novaEditorNode.Process {
    def this(command: String) = this()
    def this(command: String, options: Cwd) = this()
  }
  
  /// https://novadocs.panic.com/api-reference/range/
  @JSGlobal("Range")
  @js.native
  class Range protected ()
    extends typings.novaEditorNode.Range {
    def this(start: Double, end: Double) = this()
  }
  
  /// https://novadocs.panic.com/api-reference/scanner/
  @JSGlobal("Scanner")
  @js.native
  class Scanner protected ()
    extends typings.novaEditorNode.Scanner {
    def this(string: String) = this()
  }
  
  @JSGlobal("Task")
  @js.native
  class Task protected ()
    extends typings.novaEditorNode.Task {
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
    extends typings.novaEditorNode.TaskProcessAction {
    def this(command: String) = this()
    def this(command: String, options: Env) = this()
  }
  
  /// https://docs.nova.app/api-reference/text-edit/
  @JSGlobal("TextEdit")
  @js.native
  class TextEdit protected ()
    extends typings.novaEditorNode.TextEdit {
    def this(range: typings.novaEditorNode.Range, newText: String) = this()
  }
  object TextEdit {
    
    /* static member */
    @JSGlobal("TextEdit.delete")
    @js.native
    def delete(range: typings.novaEditorNode.Range): typings.novaEditorNode.TextEdit = js.native
    
    /* static member */
    @JSGlobal("TextEdit.insert")
    @js.native
    def insert(position: Double, newText: String): typings.novaEditorNode.TextEdit = js.native
    
    /* static member */
    @JSGlobal("TextEdit.replace")
    @js.native
    def replace(range: typings.novaEditorNode.Range, newText: String): typings.novaEditorNode.TextEdit = js.native
  }
  
  /// https://novadocs.panic.com/api-reference/text-editor/
  @JSGlobal("TextEditor")
  @js.native
  class TextEditor protected ()
    extends typings.novaEditorNode.TextEditor
  object TextEditor {
    
    /* static member */
    @JSGlobal("TextEditor.isTextEditor")
    @js.native
    def isTextEditor(`object`: js.Any): /* is nova-editor-node.TextEditor */ Boolean = js.native
  }
  
  /// https://novadocs.panic.com/api-reference/tree-item/
  @JSGlobal("TreeItem")
  @js.native
  class TreeItem protected ()
    extends typings.novaEditorNode.TreeItem {
    def this(name: String) = this()
    def this(name: String, collapsibleState: TreeItemCollapsibleState) = this()
  }
  
  @JSGlobal("TreeItemCollapsibleState")
  @js.native
  object TreeItemCollapsibleState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.novaEditorNode.TreeItemCollapsibleState with Double] = js.native
    
    /* 1 */ val Collapsed: typings.novaEditorNode.TreeItemCollapsibleState.Collapsed with Double = js.native
    
    /* 2 */ val Expanded: typings.novaEditorNode.TreeItemCollapsibleState.Expanded with Double = js.native
    
    /* 0 */ val None: typings.novaEditorNode.TreeItemCollapsibleState.None with Double = js.native
  }
  
  /// https://novadocs.panic.com/api-reference/tree-view/
  @JSGlobal("TreeView")
  @js.native
  class TreeView[E] protected ()
    extends typings.novaEditorNode.TreeView[E] {
    def this(identifier: String) = this()
    def this(identifier: String, options: DataProvider[E]) = this()
  }
  
  /// https://novadocs.panic.com/api-reference/
  @JSGlobal("atob")
  @js.native
  def atob(data: String): String = js.native
  
  @JSGlobal("btoa")
  @js.native
  def btoa(data: String): String = js.native
  
  @JSGlobal("clearInterval")
  @js.native
  def clearInterval(): Unit = js.native
  @JSGlobal("clearInterval")
  @js.native
  def clearInterval(handle: Double): Unit = js.native
  
  @JSGlobal("clearTimeout")
  @js.native
  def clearTimeout(): Unit = js.native
  @JSGlobal("clearTimeout")
  @js.native
  def clearTimeout(handle: Double): Unit = js.native
  
  @JSGlobal("nova")
  @js.native
  val nova: Environment = js.native
  
  @JSGlobal("setInterval")
  @js.native
  def setInterval(handler: TimerHandler, timeout: js.UndefOr[scala.Nothing], arguments: js.Any*): Double = js.native
  @JSGlobal("setInterval")
  @js.native
  def setInterval(handler: TimerHandler, timeout: Double, arguments: js.Any*): Double = js.native
  
  @JSGlobal("setTimeout")
  @js.native
  def setTimeout(handler: TimerHandler, timeout: js.UndefOr[scala.Nothing], arguments: js.Any*): Double = js.native
  @JSGlobal("setTimeout")
  @js.native
  def setTimeout(handler: TimerHandler, timeout: Double, arguments: js.Any*): Double = js.native
}
