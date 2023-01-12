package typings.nbind

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.nbind.anon.Bindvalue
import typings.nbind.distCommonMod.SignatureType
import typings.nbind.nbindStrings.emcc
import typings.nbind.nbindStrings.node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nbind", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("nbind", "Binding")
  @js.native
  open class Binding[ExportType /* <: DefaultExportType */] ()
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var binary: ModuleSpec = js.native
    
    /** Bind a value type (class with a fromJS method) to an equivalent C++ type. */
    def bind(name: String, proto: ClassType): Unit = js.native
    
    /** Exported API of a C++ library compiled for nbind. */
    var lib: ExportType = js.native
    
    var queryType: js.UndefOr[
        js.Function2[
          /* id */ Double, 
          /* outTypeDetail */ js.Function2[/* kind */ Double, /* repeated */ Any, Any], 
          Any
        ]
      ] = js.native
    
    def reflect(
      outPrimitive: js.Function3[/* id */ Double, /* size */ Double, /* flag */ Double, Unit],
      outType: js.Function2[/* id */ Double, /* name */ String, Unit],
      outClass: js.Function2[/* id */ Double, /* name */ String, Unit],
      outSuper: js.Function2[/* classId */ Double, /* superIdList */ js.Array[Double], Unit],
      outMethod: js.Function5[
          /* classId */ Double, 
          /* name */ String, 
          /* kind */ SignatureType, 
          /* argTypeList */ js.Array[Double], 
          /* policyList */ js.Array[String], 
          Unit
        ]
    ): Unit = js.native
    
    def toggleLightGC(enable: Boolean): Unit = js.native
  }
  
  inline def find(): ModuleSpec = ^.asInstanceOf[js.Dynamic].applyDynamic("find")().asInstanceOf[ModuleSpec]
  inline def find(basePath: String): ModuleSpec = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(basePath.asInstanceOf[js.Any]).asInstanceOf[ModuleSpec]
  inline def find(basePath: String, cb: FindCallback): ModuleSpec = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(basePath.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[ModuleSpec]
  inline def find(cb: FindCallback): ModuleSpec = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(cb.asInstanceOf[js.Any]).asInstanceOf[ModuleSpec]
  
  inline def init[ExportType /* <: DefaultExportType */](): Binding[ExportType] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Binding[ExportType]]
  inline def init[ExportType /* <: DefaultExportType */](basePath: String): Binding[ExportType] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(basePath.asInstanceOf[js.Any]).asInstanceOf[Binding[ExportType]]
  inline def init[ExportType /* <: DefaultExportType */](basePath: String, cb: InitCallback[ExportType]): Binding[ExportType] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(basePath.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Binding[ExportType]]
  inline def init[ExportType /* <: DefaultExportType */](basePath: String, lib: ExportType): Binding[ExportType] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(basePath.asInstanceOf[js.Any], lib.asInstanceOf[js.Any])).asInstanceOf[Binding[ExportType]]
  inline def init[ExportType /* <: DefaultExportType */](basePath: String, lib: ExportType, cb: InitCallback[ExportType]): Binding[ExportType] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(basePath.asInstanceOf[js.Any], lib.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Binding[ExportType]]
  inline def init[ExportType /* <: DefaultExportType */](cb: InitCallback[ExportType]): Binding[ExportType] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(cb.asInstanceOf[js.Any]).asInstanceOf[Binding[ExportType]]
  
  @js.native
  trait ClassType
    extends StObject
       with Instantiable1[/* args (repeated) */ Any, Any]
  
  trait DefaultExportType
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var NBind: js.UndefOr[Bindvalue] = js.undefined
    
    var _nbind_value: js.UndefOr[js.Function2[/* name */ String, /* proto */ ClassType, Unit]] = js.undefined
    
    var ccall: js.UndefOr[
        js.Function4[
          /* name */ String, 
          /* returnType */ js.UndefOr[String], 
          /* argTypes */ js.UndefOr[js.Array[String]], 
          /* args */ js.UndefOr[js.Array[Any]], 
          Any
        ]
      ] = js.undefined
    
    var locateFile: js.UndefOr[js.Function1[/* name */ String, String]] = js.undefined
    
    var onRuntimeInitialized: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object DefaultExportType {
    
    inline def apply(): DefaultExportType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultExportType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultExportType] (val x: Self) extends AnyVal {
      
      inline def setCcall(
        value: (/* name */ String, /* returnType */ js.UndefOr[String], /* argTypes */ js.UndefOr[js.Array[String]], /* args */ js.UndefOr[js.Array[Any]]) => Any
      ): Self = StObject.set(x, "ccall", js.Any.fromFunction4(value))
      
      inline def setCcallUndefined: Self = StObject.set(x, "ccall", js.undefined)
      
      inline def setLocateFile(value: /* name */ String => String): Self = StObject.set(x, "locateFile", js.Any.fromFunction1(value))
      
      inline def setLocateFileUndefined: Self = StObject.set(x, "locateFile", js.undefined)
      
      inline def setNBind(value: Bindvalue): Self = StObject.set(x, "NBind", value.asInstanceOf[js.Any])
      
      inline def setNBindUndefined: Self = StObject.set(x, "NBind", js.undefined)
      
      inline def setOnRuntimeInitialized(value: () => Unit): Self = StObject.set(x, "onRuntimeInitialized", js.Any.fromFunction0(value))
      
      inline def setOnRuntimeInitializedUndefined: Self = StObject.set(x, "onRuntimeInitialized", js.undefined)
      
      inline def set_nbind_value(value: (/* name */ String, /* proto */ ClassType) => Unit): Self = StObject.set(x, "_nbind_value", js.Any.fromFunction2(value))
      
      inline def set_nbind_valueUndefined: Self = StObject.set(x, "_nbind_value", js.undefined)
    }
  }
  
  type FindCallback = js.Function2[/* err */ Any, /* result */ js.UndefOr[ModuleSpec], Any]
  
  trait FindModuleSpec extends StObject {
    
    var ext: String
    
    var name: String
    
    var path: js.UndefOr[String] = js.undefined
    
    var `type`: node | emcc
  }
  object FindModuleSpec {
    
    inline def apply(ext: String, name: String, `type`: node | emcc): FindModuleSpec = {
      val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FindModuleSpec]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FindModuleSpec] (val x: Self) extends AnyVal {
      
      inline def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setType(value: node | emcc): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type InitCallback[ExportType /* <: DefaultExportType */] = js.Function2[/* err */ Any, /* result */ js.UndefOr[Binding[ExportType]], Any]
  
  trait ModuleSpec
    extends StObject
       with FindModuleSpec {
    
    @JSName("path")
    var path_ModuleSpec: String
  }
  object ModuleSpec {
    
    inline def apply(ext: String, name: String, path: String, `type`: node | emcc): ModuleSpec = {
      val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleSpec]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModuleSpec] (val x: Self) extends AnyVal {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
