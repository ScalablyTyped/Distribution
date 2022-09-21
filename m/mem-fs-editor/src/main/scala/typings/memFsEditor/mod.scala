package typings.memFsEditor

import typings.ejs.mod.Data
import typings.ejs.mod.Options
import typings.glob.mod.IOptions
import typings.jsonSchema.mod.JSONSchema7Type
import typings.memFs.mod.Store
import typings.memFsEditor.memFsEditorBooleans.`false`
import typings.memFsEditor.memFsEditorBooleans.`true`
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Transform
import typings.std.Exclude
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mem-fs-editor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(store: Store): Editor = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(store.asInstanceOf[js.Any]).asInstanceOf[Editor]
  
  trait AppendOptions extends StObject {
    
    var separator: js.UndefOr[String] = js.undefined
    
    var trimEnd: js.UndefOr[Boolean] = js.undefined
  }
  object AppendOptions {
    
    inline def apply(): AppendOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppendOptions]
    }
    
    extension [Self <: AppendOptions](x: Self) {
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setTrimEnd(value: Boolean): Self = StObject.set(x, "trimEnd", value.asInstanceOf[js.Any])
      
      inline def setTrimEndUndefined: Self = StObject.set(x, "trimEnd", js.undefined)
    }
  }
  
  //#endregion
  //#region Editor#commit
  type CommitCallback = js.Function1[/* err */ Any, Unit]
  
  trait CopyOptions
    extends StObject
       with WithGlobOptions {
    
    var ignoreNoMatch: js.UndefOr[Boolean] = js.undefined
    
    var process: js.UndefOr[ProcessingFunction] = js.undefined
    
    var processDestinationPath: js.UndefOr[js.Function1[/* path */ String, String]] = js.undefined
  }
  object CopyOptions {
    
    inline def apply(): CopyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CopyOptions]
    }
    
    extension [Self <: CopyOptions](x: Self) {
      
      inline def setIgnoreNoMatch(value: Boolean): Self = StObject.set(x, "ignoreNoMatch", value.asInstanceOf[js.Any])
      
      inline def setIgnoreNoMatchUndefined: Self = StObject.set(x, "ignoreNoMatch", js.undefined)
      
      inline def setProcess(value: (/* contents */ Buffer, /* path */ String) => WriteContents): Self = StObject.set(x, "process", js.Any.fromFunction2(value))
      
      inline def setProcessDestinationPath(value: /* path */ String => String): Self = StObject.set(x, "processDestinationPath", js.Any.fromFunction1(value))
      
      inline def setProcessDestinationPathUndefined: Self = StObject.set(x, "processDestinationPath", js.undefined)
      
      inline def setProcessUndefined: Self = StObject.set(x, "process", js.undefined)
    }
  }
  
  @js.native
  trait Editor extends StObject {
    
    def append(filepath: String, contents: WriteContents): String = js.native
    def append(filepath: String, contents: WriteContents, options: AppendOptions): String = js.native
    
    def commit(callback: CommitCallback): Unit = js.native
    def commit(filters: js.Array[Transform], callback: CommitCallback): Unit = js.native
    
    def copy(from: FilePaths, to: String): Unit = js.native
    def copy(from: FilePaths, to: String, options: Unit, context: Unit, templateOptions: Options): Unit = js.native
    def copy(from: FilePaths, to: String, options: Unit, context: Data): Unit = js.native
    def copy(from: FilePaths, to: String, options: Unit, context: Data, templateOptions: Options): Unit = js.native
    def copy(from: FilePaths, to: String, options: CopyOptions): Unit = js.native
    def copy(from: FilePaths, to: String, options: CopyOptions, context: Unit, templateOptions: Options): Unit = js.native
    def copy(from: FilePaths, to: String, options: CopyOptions, context: Data): Unit = js.native
    def copy(from: FilePaths, to: String, options: CopyOptions, context: Data, templateOptions: Options): Unit = js.native
    
    def copyTpl(from: FilePaths, to: String): Unit = js.native
    def copyTpl(from: FilePaths, to: String, context: Unit, templateOptions: Unit, copyOptions: CopyOptions): Unit = js.native
    def copyTpl(from: FilePaths, to: String, context: Unit, templateOptions: Options): Unit = js.native
    def copyTpl(from: FilePaths, to: String, context: Unit, templateOptions: Options, copyOptions: CopyOptions): Unit = js.native
    def copyTpl(from: FilePaths, to: String, context: Data): Unit = js.native
    def copyTpl(from: FilePaths, to: String, context: Data, templateOptions: Unit, copyOptions: CopyOptions): Unit = js.native
    def copyTpl(from: FilePaths, to: String, context: Data, templateOptions: Options): Unit = js.native
    def copyTpl(from: FilePaths, to: String, context: Data, templateOptions: Options, copyOptions: CopyOptions): Unit = js.native
    
    def delete(filepath: FilePaths): Unit = js.native
    def delete(filepath: FilePaths, options: WithGlobOptions): Unit = js.native
    
    def exists(filepath: String): Boolean = js.native
    
    def extendJSON(filepath: String, contents: Any): Unit = js.native
    def extendJSON(filepath: String, contents: Any, replacer: Unit, space: WriteJsonSpace): Unit = js.native
    def extendJSON(filepath: String, contents: Any, replacer: WriteJsonReplacer): Unit = js.native
    def extendJSON(filepath: String, contents: Any, replacer: WriteJsonReplacer, space: WriteJsonSpace): Unit = js.native
    
    def move(from: FilePaths, to: String): Unit = js.native
    def move(from: FilePaths, to: String, options: WithGlobOptions): Unit = js.native
    
    def read(filepath: String): String = js.native
    def read(filepath: String, options: ReadRawOptions): ReadRawContents = js.native
    def read(filepath: String, options: ReadStringOptions): String = js.native
    
    def readJSON(filepath: String): js.UndefOr[JSONSchema7Type] = js.native
    def readJSON(filepath: String, defaults: JSONSchema7Type): JSONSchema7Type = js.native
    
    def write(filepath: String, contents: WriteContents): String = js.native
    
    def writeJSON(filepath: String, contents: Any): String = js.native
    def writeJSON(filepath: String, contents: Any, replacer: Unit, space: WriteJsonSpace): String = js.native
    def writeJSON(filepath: String, contents: Any, replacer: WriteJsonReplacer): String = js.native
    def writeJSON(filepath: String, contents: Any, replacer: WriteJsonReplacer, space: WriteJsonSpace): String = js.native
  }
  
  type FilePaths = String | js.Array[String]
  
  type ProcessingFunction = js.Function2[/* contents */ Buffer, /* path */ String, WriteContents]
  
  type ReadRawContents = Exclude[Buffer | ReadableStream[Any] | Null, Null]
  
  trait ReadRawOptions extends StObject {
    
    var defaults: js.UndefOr[ReadRawContents] = js.undefined
    
    var raw: `true`
  }
  object ReadRawOptions {
    
    inline def apply(): ReadRawOptions = {
      val __obj = js.Dynamic.literal(raw = true)
      __obj.asInstanceOf[ReadRawOptions]
    }
    
    extension [Self <: ReadRawOptions](x: Self) {
      
      inline def setDefaults(value: ReadRawContents): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      inline def setDefaultsNull: Self = StObject.set(x, "defaults", null)
      
      inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      inline def setRaw(value: `true`): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReadStringOptions extends StObject {
    
    var defaults: js.UndefOr[String] = js.undefined
    
    var raw: js.UndefOr[`false`] = js.undefined
  }
  object ReadStringOptions {
    
    inline def apply(): ReadStringOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadStringOptions]
    }
    
    extension [Self <: ReadStringOptions](x: Self) {
      
      inline def setDefaults(value: String): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      inline def setRaw(value: `false`): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    }
  }
  
  trait WithGlobOptions extends StObject {
    
    var globOptions: js.UndefOr[IOptions] = js.undefined
  }
  object WithGlobOptions {
    
    inline def apply(): WithGlobOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithGlobOptions]
    }
    
    extension [Self <: WithGlobOptions](x: Self) {
      
      inline def setGlobOptions(value: IOptions): Self = StObject.set(x, "globOptions", value.asInstanceOf[js.Any])
      
      inline def setGlobOptionsUndefined: Self = StObject.set(x, "globOptions", js.undefined)
    }
  }
  
  //#endregion
  //#region Editor#write
  type WriteContents = String | Buffer
  
  //#endregion
  //#region Editor#writeJSON
  type WriteJsonReplacer = (js.Function2[/* key */ String, /* value */ Any, Any]) | (js.Array[String | Double])
  
  type WriteJsonSpace = Double | String
}
