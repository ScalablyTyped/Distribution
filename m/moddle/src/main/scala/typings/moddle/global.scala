package typings.moddle

import org.scalablytyped.runtime.StringDictionary
import typings.moddle.mod.BuiltInTypes
import typings.moddle.mod.Descriptor
import typings.moddle.mod.Ns
import typings.moddle.mod.PackageDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Moddle {
    
    @JSGlobal("Moddle")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Moddle.AnyElement")
    @js.native
    open class AnyElement ()
      extends typings.moddle.mod.AnyElement
    
    @JSGlobal("Moddle.Element")
    @js.native
    open class Element ()
      extends typings.moddle.mod.Element {
      def this(fields: StringDictionary[Any]) = this()
    }
    /* static members */
    object Element {
      
      @JSGlobal("Moddle.Element")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Moddle.Element.$descriptor")
      @js.native
      def $descriptor: Descriptor = js.native
      inline def $descriptor_=(x: Descriptor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$descriptor")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Moddle.Element.$model")
      @js.native
      def $model: typings.moddle.mod.Moddle = js.native
      inline def $model_=(x: typings.moddle.mod.Moddle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$model")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("Moddle.Factory")
    @js.native
    open class Factory protected ()
      extends typings.moddle.mod.Factory {
      def this(model: typings.moddle.mod.Moddle, properties: typings.moddle.mod.Properties) = this()
    }
    
    @JSGlobal("Moddle.Moddle")
    @js.native
    open class Moddle protected ()
      extends typings.moddle.mod.Moddle {
      def this(packages: js.Array[PackageDefinition]) = this()
    }
    
    @JSGlobal("Moddle.ModdleBase")
    @js.native
    open class ModdleBase ()
      extends typings.moddle.mod.ModdleBase
    
    @JSGlobal("Moddle.Properties")
    @js.native
    open class Properties protected ()
      extends typings.moddle.mod.Properties {
      def this(moddle: typings.moddle.mod.Moddle) = this()
    }
    
    @JSGlobal("Moddle.Registry")
    @js.native
    open class Registry protected ()
      extends typings.moddle.mod.Registry {
      def this(packages: js.Array[PackageDefinition], properties: typings.moddle.mod.Properties) = this()
    }
    
    inline def coerceType[T /* <: BuiltInTypes | String */, V](`type`: T, value: V): /* import warning: importer.ImportType#apply Failed type conversion: moddle.moddle.ModdleTypesMap extends std.Record<T, infer E> ? E : V */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("coerceType")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: moddle.moddle.ModdleTypesMap extends std.Record<T, infer E> ? E : V */ js.Any]
    
    inline def isBuiltInType(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBuiltInType")().asInstanceOf[Boolean]
    inline def isBuiltInType(`type`: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBuiltInType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isSimpleType(`type`: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSimpleType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def parseNameNs(name: String): Ns = ^.asInstanceOf[js.Dynamic].applyDynamic("parseNameNs")(name.asInstanceOf[js.Any]).asInstanceOf[Ns]
    inline def parseNameNs(name: String, defaultPrefix: String): Ns = (^.asInstanceOf[js.Dynamic].applyDynamic("parseNameNs")(name.asInstanceOf[js.Any], defaultPrefix.asInstanceOf[js.Any])).asInstanceOf[Ns]
  }
}
