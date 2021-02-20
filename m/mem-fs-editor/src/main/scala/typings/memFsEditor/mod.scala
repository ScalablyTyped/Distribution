package typings.memFsEditor

import typings.ejs.mod.Data
import typings.ejs.mod.Options
import typings.glob.mod.IOptions
import typings.jsonSchema.mod.JSONSchema7Type
import typings.memFs.mod.Store
import typings.memFsEditor.memFsEditorBooleans.`false`
import typings.memFsEditor.memFsEditorBooleans.`true`
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.node.streamMod.Transform
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mem-fs-editor", "create")
  @js.native
  def create(store: Store): Editor = js.native
  
  @js.native
  trait AppendOptions extends StObject {
    
    var separator: js.UndefOr[String] = js.native
    
    var trimEnd: js.UndefOr[Boolean] = js.native
  }
  object AppendOptions {
    
    @scala.inline
    def apply(): AppendOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppendOptions]
    }
    
    @scala.inline
    implicit class AppendOptionsMutableBuilder[Self <: AppendOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setTrimEnd(value: Boolean): Self = StObject.set(x, "trimEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrimEndUndefined: Self = StObject.set(x, "trimEnd", js.undefined)
    }
  }
  
  //#endregion
  //#region Editor#commit
  type CommitCallback = js.Function1[/* err */ js.Any, Unit]
  
  @js.native
  trait CopyOptions extends WithGlobOptions {
    
    var ignoreNoMatch: js.UndefOr[Boolean] = js.native
    
    var process: js.UndefOr[ProcessingFunction] = js.native
    
    var processDestinationPath: js.UndefOr[js.Function1[/* path */ String, String]] = js.native
  }
  object CopyOptions {
    
    @scala.inline
    def apply(): CopyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CopyOptions]
    }
    
    @scala.inline
    implicit class CopyOptionsMutableBuilder[Self <: CopyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIgnoreNoMatch(value: Boolean): Self = StObject.set(x, "ignoreNoMatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreNoMatchUndefined: Self = StObject.set(x, "ignoreNoMatch", js.undefined)
      
      @scala.inline
      def setProcess(value: (/* contents */ Buffer, /* path */ String) => WriteContents): Self = StObject.set(x, "process", js.Any.fromFunction2(value))
      
      @scala.inline
      def setProcessDestinationPath(value: /* path */ String => String): Self = StObject.set(x, "processDestinationPath", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProcessDestinationPathUndefined: Self = StObject.set(x, "processDestinationPath", js.undefined)
      
      @scala.inline
      def setProcessUndefined: Self = StObject.set(x, "process", js.undefined)
    }
  }
  
  @js.native
  trait Editor extends StObject {
    
    def append(filepath: String, contents: WriteContents): String = js.native
    def append(filepath: String, contents: WriteContents, options: AppendOptions): String = js.native
    
    def commit(callback: CommitCallback): Unit = js.native
    def commit(filters: js.Array[Transform], callback: CommitCallback): Unit = js.native
    
    def copy(from: FilePaths, to: String): Unit = js.native
    def copy(
      from: FilePaths,
      to: String,
      options: js.UndefOr[scala.Nothing],
      context: js.UndefOr[scala.Nothing],
      templateOptions: Options
    ): Unit = js.native
    def copy(from: FilePaths, to: String, options: js.UndefOr[scala.Nothing], context: Data): Unit = js.native
    def copy(
      from: FilePaths,
      to: String,
      options: js.UndefOr[scala.Nothing],
      context: Data,
      templateOptions: Options
    ): Unit = js.native
    def copy(from: FilePaths, to: String, options: CopyOptions): Unit = js.native
    def copy(
      from: FilePaths,
      to: String,
      options: CopyOptions,
      context: js.UndefOr[scala.Nothing],
      templateOptions: Options
    ): Unit = js.native
    def copy(from: FilePaths, to: String, options: CopyOptions, context: Data): Unit = js.native
    def copy(from: FilePaths, to: String, options: CopyOptions, context: Data, templateOptions: Options): Unit = js.native
    
    def copyTpl(from: FilePaths, to: String): Unit = js.native
    def copyTpl(
      from: FilePaths,
      to: String,
      context: js.UndefOr[scala.Nothing],
      templateOptions: js.UndefOr[scala.Nothing],
      copyOptions: CopyOptions
    ): Unit = js.native
    def copyTpl(from: FilePaths, to: String, context: js.UndefOr[scala.Nothing], templateOptions: Options): Unit = js.native
    def copyTpl(
      from: FilePaths,
      to: String,
      context: js.UndefOr[scala.Nothing],
      templateOptions: Options,
      copyOptions: CopyOptions
    ): Unit = js.native
    def copyTpl(from: FilePaths, to: String, context: Data): Unit = js.native
    def copyTpl(
      from: FilePaths,
      to: String,
      context: Data,
      templateOptions: js.UndefOr[scala.Nothing],
      copyOptions: CopyOptions
    ): Unit = js.native
    def copyTpl(from: FilePaths, to: String, context: Data, templateOptions: Options): Unit = js.native
    def copyTpl(from: FilePaths, to: String, context: Data, templateOptions: Options, copyOptions: CopyOptions): Unit = js.native
    
    def delete(filepath: FilePaths): Unit = js.native
    def delete(filepath: FilePaths, options: WithGlobOptions): Unit = js.native
    
    def exists(filepath: String): Boolean = js.native
    
    def extendJSON(filepath: String, contents: js.Any): Unit = js.native
    def extendJSON(filepath: String, contents: js.Any, replacer: js.UndefOr[WriteJsonReplacer], space: WriteJsonSpace): Unit = js.native
    def extendJSON(filepath: String, contents: js.Any, replacer: WriteJsonReplacer): Unit = js.native
    
    def move(from: FilePaths, to: String): Unit = js.native
    def move(from: FilePaths, to: String, options: WithGlobOptions): Unit = js.native
    
    def read(filepath: String): String = js.native
    def read(filepath: String, options: ReadRawOptions): ReadRawContents = js.native
    def read(filepath: String, options: ReadStringOptions): String = js.native
    
    def readJSON(filepath: String): js.UndefOr[JSONSchema7Type] = js.native
    def readJSON(filepath: String, defaults: JSONSchema7Type): JSONSchema7Type = js.native
    
    def write(filepath: String, contents: WriteContents): String = js.native
    
    def writeJSON(filepath: String, contents: js.Any): String = js.native
    def writeJSON(filepath: String, contents: js.Any, replacer: js.UndefOr[WriteJsonReplacer], space: WriteJsonSpace): String = js.native
    def writeJSON(filepath: String, contents: js.Any, replacer: WriteJsonReplacer): String = js.native
  }
  
  type FilePaths = String | js.Array[String]
  
  type ProcessingFunction = js.Function2[/* contents */ Buffer, /* path */ String, WriteContents]
  
  type ReadRawContents = Exclude[Buffer | ReadableStream | Null, Null]
  
  @js.native
  trait ReadRawOptions extends StObject {
    
    var defaults: js.UndefOr[ReadRawContents] = js.native
    
    var raw: `true` = js.native
  }
  object ReadRawOptions {
    
    @scala.inline
    def apply(raw: `true`): ReadRawOptions = {
      val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadRawOptions]
    }
    
    @scala.inline
    implicit class ReadRawOptionsMutableBuilder[Self <: ReadRawOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaults(value: ReadRawContents): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultsNull: Self = StObject.set(x, "defaults", null)
      
      @scala.inline
      def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      @scala.inline
      def setRaw(value: `true`): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReadStringOptions extends StObject {
    
    var defaults: js.UndefOr[String] = js.native
    
    var raw: js.UndefOr[`false`] = js.native
  }
  object ReadStringOptions {
    
    @scala.inline
    def apply(): ReadStringOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadStringOptions]
    }
    
    @scala.inline
    implicit class ReadStringOptionsMutableBuilder[Self <: ReadStringOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaults(value: String): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      @scala.inline
      def setRaw(value: `false`): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    }
  }
  
  @js.native
  trait WithGlobOptions extends StObject {
    
    var globOptions: js.UndefOr[IOptions] = js.native
  }
  object WithGlobOptions {
    
    @scala.inline
    def apply(): WithGlobOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithGlobOptions]
    }
    
    @scala.inline
    implicit class WithGlobOptionsMutableBuilder[Self <: WithGlobOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlobOptions(value: IOptions): Self = StObject.set(x, "globOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobOptionsUndefined: Self = StObject.set(x, "globOptions", js.undefined)
    }
  }
  
  //#endregion
  //#region Editor#write
  type WriteContents = String | Buffer
  
  //#endregion
  //#region Editor#writeJSON
  type WriteJsonReplacer = (js.Function2[/* key */ String, /* value */ js.Any, js.Any]) | (js.Array[String | Double])
  
  type WriteJsonSpace = Double | String
}
