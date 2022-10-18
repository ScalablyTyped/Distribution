package typings.openui5

import typings.openui5.anon.EditorEvent
import typings.openui5.anon.OldValue
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCodeeditorCodeEditorMod {
  
  @JSImport("sap/ui/codeeditor/CodeEditor", JSImport.Default)
  @js.native
  /**
    * Constructor for a new CodeEditor.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends CodeEditor {
    def this(/**
      * initial settings for the new control
      */
    mSettings: CodeEditorSettings) = this()
    def this(/**
      * id for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * initial settings for the new control
      */
    mSettings: CodeEditorSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: CodeEditorSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/codeeditor/CodeEditor", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.codeeditor.CodeEditor with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Control.extend}.
      *
      * @returns Created class / constructor function
      */
    inline def extend[T /* <: Record[String, Any] */](/**
      * Name of the class being created
      */
    sClassName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: Unit,
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, CodeEditor]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, CodeEditor],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.codeeditor.CodeEditor.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait CodeEditor
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * @SINCE 1.52
      *
      * Defines custom completer - object implementing a getCompletions method. The method has two parameters
      * - fnCallback method and context object. Context object provides details about oPos and sPrefix as provided
      * by the third-party code editor.
      */
    def addCustomCompleter(/**
      * Object with getCompletions method
      */
    oCustomCompleter: js.Object): Unit = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.ui.codeeditor.CodeEditor`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.codeeditor.CodeEditor` itself.
      *
      * Fired when the value has changed and the focus leaves the code editor.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.codeeditor.CodeEditor` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.ui.codeeditor.CodeEditor`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.codeeditor.CodeEditor` itself.
      *
      * Fired when the value has changed and the focus leaves the code editor.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachChange(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachChange(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.codeeditor.CodeEditor` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:liveChange liveChange} event of this `sap.ui.codeeditor.CodeEditor`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.codeeditor.CodeEditor` itself.
      *
      * Fired when the value is changed by user interaction - each keystroke, delete, paste, etc.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLiveChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachLiveChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.codeeditor.CodeEditor` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:liveChange liveChange} event of this `sap.ui.codeeditor.CodeEditor`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.codeeditor.CodeEditor` itself.
      *
      * Fired when the value is changed by user interaction - each keystroke, delete, paste, etc.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLiveChange(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachLiveChange(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.codeeditor.CodeEditor` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:change change} event of this `sap.ui.codeeditor.CodeEditor`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:liveChange liveChange} event of this `sap.ui.codeeditor.CodeEditor`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachLiveChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachLiveChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Fires event {@link #event:change change} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireChange(): this.type = js.native
    def fireChange(/**
      * Parameters to pass along with the event
      */
    mParameters: OldValue): this.type = js.native
    
    /**
      * Fires event {@link #event:liveChange liveChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireLiveChange(): this.type = js.native
    def fireLiveChange(/**
      * Parameters to pass along with the event
      */
    mParameters: EditorEvent): this.type = js.native
    
    /**
      * Gets current value of property {@link #getColorTheme colorTheme}.
      *
      * Sets the editor color theme. Possible values are: default, hcb, hcb_bright, hcb_blue, theme-ambiance,
      * chaos, chrome, clouds, clouds_midnight, cobalt, crimson_editor, dawn, dreamweaver, eclipse, github, gob,
      * gruvbox, idle_fingers, iplastic, katzenmilch, kr_theme, kuroir, merbivore, merbivore_soft, mono_industrial,
      * monokai, pastel_on_dark, solarized_dark, solarized_light, sqlserver, terminal, textmate, tomorrow, tomorrow_night,
      * tomorrow_night_blue, tomorrow_night_bright, tomorrow_night_eighties, twilight, dracula vibrant_ink, xcode
      *
      * Default value is `"default"`.
      *
      * @returns Value of property `colorTheme`
      */
    def getColorTheme(): String = js.native
    
    /**
      * Returns the current value of the code editor
      *
      * @returns Returns the current value of the code editor
      */
    def getCurrentValue(): String = js.native
    
    /**
      * Gets current value of property {@link #getEditable editable}.
      *
      * Sets whether the code in the editor can be changed by the user.
      *
      * Default value is `true`.
      *
      * @returns Value of property `editable`
      */
    def getEditable(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * The height of the code editor. A minimal height of 3rem will be applied in case the height is less than
      * 20px.
      *
      * Default value is `"100%"`.
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getLineNumbers lineNumbers}.
      *
      * Sets whether line numbers should be shown.
      *
      * Default value is `true`.
      *
      * @returns Value of property `lineNumbers`
      */
    def getLineNumbers(): Boolean = js.native
    
    /**
      * @SINCE 1.48.1
      *
      * Gets current value of property {@link #getMaxLines maxLines}.
      *
      * Sets whether the editor height should auto expand to a maximum number of lines. After reaching the maximum
      * number of lines specified, the content of the `CodeEditor` will become scrollable.
      *
      * **Note:** Keep in mind that the auto expand `CodeEditor` behavior requires the `height` property to be
      * set to `auto`.
      *
      * Default value is `0`.
      *
      * @returns Value of property `maxLines`
      */
    def getMaxLines(): int = js.native
    
    /**
      * Gets current value of property {@link #getSyntaxHints syntaxHints}.
      *
      * Sets whether to show syntax hints in the editor. This flag is only available if line numbers are shown.
      *
      * Default value is `true`.
      *
      * @returns Value of property `syntaxHints`
      */
    def getSyntaxHints(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getType type}.
      *
      * The type of the code in the editor used for syntax highlighting. Possible types are: abap, abc, actionscript,
      * ada, apache_conf, applescript, asciidoc, assembly_x86, autohotkey, batchfile, bro, c9search, c_cpp, cirru,
      * clojure, cobol, coffee, coldfusion, csharp, css, curly, d, dart, diff, django, dockerfile, dot, drools,
      * eiffel, ejs, elixir, elm, erlang, forth, fortran, ftl, gcode, gherkin, gitignore, glsl, gobstones, golang,
      * groovy, haml, handlebars, haskell, haskell_cabal, haxe, hjson, html, html_elixir, html_ruby, ini, io,
      * jack, jade, java, javascript, json, jsoniq, jsp, jsx, julia, kotlin, latex, lean, less, liquid, lisp,
      * live_script, livescript, logiql, lsl, lua, luapage, lucene, makefile, markdown, mask, matlab, mavens_mate_log,
      * maze, mel, mips_assembler, mipsassembler, mushcode, mysql, nix, nsis, objectivec, ocaml, pascal, perl,
      * pgsql, php, plain_text, powershell, praat, prolog, properties, protobuf, python, r, razor, rdoc, rhtml,
      * rst, ruby, rust, sass, scad, scala, scheme, scss, sh, sjs, smarty, snippets, soy_template, space, sql,
      * sqlserver, stylus, svg, swift, swig, tcl, tex, text, textile, toml, tsx, twig, typescript, vala, vbscript,
      * velocity, verilog, vhdl, wollok, xml, xquery, yaml, terraform, slim, redshift, red, puppet, php_laravel_blade,
      * mixal, jssm, fsharp, edifact, csp, cssound_score, cssound_orchestra, cssound_document
      *
      * Default value is `"javascript"`.
      *
      * @returns Value of property `type`
      */
    def getType(): String = js.native
    
    /**
      * Gets current value of property {@link #getValue value}.
      *
      * The value displayed in the code editor.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `value`
      */
    def getValue(): String = js.native
    
    /**
      * Gets current value of property {@link #getValueSelection valueSelection}.
      *
      * Sets whether the code is automatically selected if a value is set.
      *
      * Default value is `false`.
      *
      * @returns Value of property `valueSelection`
      */
    def getValueSelection(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * The width of the code editor.
      *
      * Default value is `"100%"`.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * @SINCE 1.54.1
      *
      * Pretty-prints the content of the editor
      */
    def prettyPrint(): Unit = js.native
    
    /**
      * Sets the color theme of the code editor
      *
      * @returns Returns `this` to allow method chaining
      */
    def setColorTheme(/**
      * See property documentation for accepted values
      */
    sTheme: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEditable editable}.
      *
      * Sets whether the code in the editor can be changed by the user.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEditable(): this.type = js.native
    def setEditable(/**
      * New value for property `editable`
      */
    bEditable: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeight height}.
      *
      * The height of the code editor. A minimal height of 3rem will be applied in case the height is less than
      * 20px.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"100%"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeight(): this.type = js.native
    def setHeight(/**
      * New value for property `height`
      */
    sHeight: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getLineNumbers lineNumbers}.
      *
      * Sets whether line numbers should be shown.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLineNumbers(): this.type = js.native
    def setLineNumbers(/**
      * New value for property `lineNumbers`
      */
    bLineNumbers: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.48.1
      *
      * Sets a new value for property {@link #getMaxLines maxLines}.
      *
      * Sets whether the editor height should auto expand to a maximum number of lines. After reaching the maximum
      * number of lines specified, the content of the `CodeEditor` will become scrollable.
      *
      * **Note:** Keep in mind that the auto expand `CodeEditor` behavior requires the `height` property to be
      * set to `auto`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `0`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMaxLines(): this.type = js.native
    def setMaxLines(/**
      * New value for property `maxLines`
      */
    iMaxLines: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSyntaxHints syntaxHints}.
      *
      * Sets whether to show syntax hints in the editor. This flag is only available if line numbers are shown.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSyntaxHints(): this.type = js.native
    def setSyntaxHints(/**
      * New value for property `syntaxHints`
      */
    bSyntaxHints: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getType type}.
      *
      * The type of the code in the editor used for syntax highlighting. Possible types are: abap, abc, actionscript,
      * ada, apache_conf, applescript, asciidoc, assembly_x86, autohotkey, batchfile, bro, c9search, c_cpp, cirru,
      * clojure, cobol, coffee, coldfusion, csharp, css, curly, d, dart, diff, django, dockerfile, dot, drools,
      * eiffel, ejs, elixir, elm, erlang, forth, fortran, ftl, gcode, gherkin, gitignore, glsl, gobstones, golang,
      * groovy, haml, handlebars, haskell, haskell_cabal, haxe, hjson, html, html_elixir, html_ruby, ini, io,
      * jack, jade, java, javascript, json, jsoniq, jsp, jsx, julia, kotlin, latex, lean, less, liquid, lisp,
      * live_script, livescript, logiql, lsl, lua, luapage, lucene, makefile, markdown, mask, matlab, mavens_mate_log,
      * maze, mel, mips_assembler, mipsassembler, mushcode, mysql, nix, nsis, objectivec, ocaml, pascal, perl,
      * pgsql, php, plain_text, powershell, praat, prolog, properties, protobuf, python, r, razor, rdoc, rhtml,
      * rst, ruby, rust, sass, scad, scala, scheme, scss, sh, sjs, smarty, snippets, soy_template, space, sql,
      * sqlserver, stylus, svg, swift, swig, tcl, tex, text, textile, toml, tsx, twig, typescript, vala, vbscript,
      * velocity, verilog, vhdl, wollok, xml, xquery, yaml, terraform, slim, redshift, red, puppet, php_laravel_blade,
      * mixal, jssm, fsharp, edifact, csp, cssound_score, cssound_orchestra, cssound_document
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"javascript"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setType(): this.type = js.native
    def setType(/**
      * New value for property `type`
      */
    sType: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getValue value}.
      *
      * The value displayed in the code editor.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValue(): this.type = js.native
    def setValue(/**
      * New value for property `value`
      */
    sValue: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getValueSelection valueSelection}.
      *
      * Sets whether the code is automatically selected if a value is set.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValueSelection(): this.type = js.native
    def setValueSelection(/**
      * New value for property `valueSelection`
      */
    bValueSelection: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * The width of the code editor.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"100%"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
  }
  
  trait CodeEditorSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Fired when the value has changed and the focus leaves the code editor.
      */
    var change: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Sets the editor color theme. Possible values are: default, hcb, hcb_bright, hcb_blue, theme-ambiance,
      * chaos, chrome, clouds, clouds_midnight, cobalt, crimson_editor, dawn, dreamweaver, eclipse, github, gob,
      * gruvbox, idle_fingers, iplastic, katzenmilch, kr_theme, kuroir, merbivore, merbivore_soft, mono_industrial,
      * monokai, pastel_on_dark, solarized_dark, solarized_light, sqlserver, terminal, textmate, tomorrow, tomorrow_night,
      * tomorrow_night_blue, tomorrow_night_bright, tomorrow_night_eighties, twilight, dracula vibrant_ink, xcode
      */
    var colorTheme: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Sets whether the code in the editor can be changed by the user.
      */
    var editable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The height of the code editor. A minimal height of 3rem will be applied in case the height is less than
      * 20px.
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Sets whether line numbers should be shown.
      */
    var lineNumbers: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fired when the value is changed by user interaction - each keystroke, delete, paste, etc.
      */
    var liveChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.48.1
      *
      * Sets whether the editor height should auto expand to a maximum number of lines. After reaching the maximum
      * number of lines specified, the content of the `CodeEditor` will become scrollable.
      *
      * **Note:** Keep in mind that the auto expand `CodeEditor` behavior requires the `height` property to be
      * set to `auto`.
      */
    var maxLines: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Sets whether to show syntax hints in the editor. This flag is only available if line numbers are shown.
      */
    var syntaxHints: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The type of the code in the editor used for syntax highlighting. Possible types are: abap, abc, actionscript,
      * ada, apache_conf, applescript, asciidoc, assembly_x86, autohotkey, batchfile, bro, c9search, c_cpp, cirru,
      * clojure, cobol, coffee, coldfusion, csharp, css, curly, d, dart, diff, django, dockerfile, dot, drools,
      * eiffel, ejs, elixir, elm, erlang, forth, fortran, ftl, gcode, gherkin, gitignore, glsl, gobstones, golang,
      * groovy, haml, handlebars, haskell, haskell_cabal, haxe, hjson, html, html_elixir, html_ruby, ini, io,
      * jack, jade, java, javascript, json, jsoniq, jsp, jsx, julia, kotlin, latex, lean, less, liquid, lisp,
      * live_script, livescript, logiql, lsl, lua, luapage, lucene, makefile, markdown, mask, matlab, mavens_mate_log,
      * maze, mel, mips_assembler, mipsassembler, mushcode, mysql, nix, nsis, objectivec, ocaml, pascal, perl,
      * pgsql, php, plain_text, powershell, praat, prolog, properties, protobuf, python, r, razor, rdoc, rhtml,
      * rst, ruby, rust, sass, scad, scala, scheme, scss, sh, sjs, smarty, snippets, soy_template, space, sql,
      * sqlserver, stylus, svg, swift, swig, tcl, tex, text, textile, toml, tsx, twig, typescript, vala, vbscript,
      * velocity, verilog, vhdl, wollok, xml, xquery, yaml, terraform, slim, redshift, red, puppet, php_laravel_blade,
      * mixal, jssm, fsharp, edifact, csp, cssound_score, cssound_orchestra, cssound_document
      */
    var `type`: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The value displayed in the code editor.
      */
    var value: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Sets whether the code is automatically selected if a value is set.
      */
    var valueSelection: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The width of the code editor.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object CodeEditorSettings {
    
    inline def apply(): CodeEditorSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CodeEditorSettings]
    }
    
    extension [Self <: CodeEditorSettings](x: Self) {
      
      inline def setChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setColorTheme(value: String | PropertyBindingInfo): Self = StObject.set(x, "colorTheme", value.asInstanceOf[js.Any])
      
      inline def setColorThemeUndefined: Self = StObject.set(x, "colorTheme", js.undefined)
      
      inline def setEditable(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLineNumbers(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "lineNumbers", value.asInstanceOf[js.Any])
      
      inline def setLineNumbersUndefined: Self = StObject.set(x, "lineNumbers", js.undefined)
      
      inline def setLiveChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "liveChange", js.Any.fromFunction1(value))
      
      inline def setLiveChangeUndefined: Self = StObject.set(x, "liveChange", js.undefined)
      
      inline def setMaxLines(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
      
      inline def setMaxLinesUndefined: Self = StObject.set(x, "maxLines", js.undefined)
      
      inline def setSyntaxHints(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "syntaxHints", value.asInstanceOf[js.Any])
      
      inline def setSyntaxHintsUndefined: Self = StObject.set(x, "syntaxHints", js.undefined)
      
      inline def setType(value: String | PropertyBindingInfo): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String | PropertyBindingInfo): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueSelection(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "valueSelection", value.asInstanceOf[js.Any])
      
      inline def setValueSelectionUndefined: Self = StObject.set(x, "valueSelection", js.undefined)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
