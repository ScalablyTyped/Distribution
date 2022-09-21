package typings.nopt

import org.scalablytyped.runtime.StringDictionary
import typings.nopt.anon.Cooked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(types: FlagTypeMap): OptionsParsed = ^.asInstanceOf[js.Dynamic].apply(types.asInstanceOf[js.Any]).asInstanceOf[OptionsParsed]
  inline def apply(types: FlagTypeMap, shorthands: Unit, args: js.Array[String]): OptionsParsed = (^.asInstanceOf[js.Dynamic].apply(types.asInstanceOf[js.Any], shorthands.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[OptionsParsed]
  inline def apply(types: FlagTypeMap, shorthands: Unit, args: js.Array[String], slice: Double): OptionsParsed = (^.asInstanceOf[js.Dynamic].apply(types.asInstanceOf[js.Any], shorthands.asInstanceOf[js.Any], args.asInstanceOf[js.Any], slice.asInstanceOf[js.Any])).asInstanceOf[OptionsParsed]
  inline def apply(types: FlagTypeMap, shorthands: Unit, args: Unit, slice: Double): OptionsParsed = (^.asInstanceOf[js.Dynamic].apply(types.asInstanceOf[js.Any], shorthands.asInstanceOf[js.Any], args.asInstanceOf[js.Any], slice.asInstanceOf[js.Any])).asInstanceOf[OptionsParsed]
  inline def apply(types: FlagTypeMap, shorthands: ShortFlags): OptionsParsed = (^.asInstanceOf[js.Dynamic].apply(types.asInstanceOf[js.Any], shorthands.asInstanceOf[js.Any])).asInstanceOf[OptionsParsed]
  inline def apply(types: FlagTypeMap, shorthands: ShortFlags, args: js.Array[String]): OptionsParsed = (^.asInstanceOf[js.Dynamic].apply(types.asInstanceOf[js.Any], shorthands.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[OptionsParsed]
  inline def apply(types: FlagTypeMap, shorthands: ShortFlags, args: js.Array[String], slice: Double): OptionsParsed = (^.asInstanceOf[js.Dynamic].apply(types.asInstanceOf[js.Any], shorthands.asInstanceOf[js.Any], args.asInstanceOf[js.Any], slice.asInstanceOf[js.Any])).asInstanceOf[OptionsParsed]
  inline def apply(types: FlagTypeMap, shorthands: ShortFlags, args: Unit, slice: Double): OptionsParsed = (^.asInstanceOf[js.Dynamic].apply(types.asInstanceOf[js.Any], shorthands.asInstanceOf[js.Any], args.asInstanceOf[js.Any], slice.asInstanceOf[js.Any])).asInstanceOf[OptionsParsed]
  
  @JSImport("nopt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clean(data: CommandData, types: FlagTypeMap): String = (^.asInstanceOf[js.Dynamic].applyDynamic("clean")(data.asInstanceOf[js.Any], types.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def clean(data: CommandData, types: FlagTypeMap, typeDefs: TypeDefs_): String = (^.asInstanceOf[js.Dynamic].applyDynamic("clean")(data.asInstanceOf[js.Any], types.asInstanceOf[js.Any], typeDefs.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("nopt", "typeDefs")
  @js.native
  def typeDefs: TypeDefs_ = js.native
  inline def typeDefs_=(x: TypeDefs_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typeDefs")(x.asInstanceOf[js.Any])
  
  type CommandData = StringDictionary[String]
  
  type FlagTypeMap = StringDictionary[js.Object]
  
  trait OptionsParsed
    extends StObject
       with /* k */ StringDictionary[Any] {
    
    var argv: Cooked
  }
  object OptionsParsed {
    
    inline def apply(argv: Cooked): OptionsParsed = {
      val __obj = js.Dynamic.literal(argv = argv.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsParsed]
    }
    
    extension [Self <: OptionsParsed](x: Self) {
      
      inline def setArgv(value: Cooked): Self = StObject.set(x, "argv", value.asInstanceOf[js.Any])
    }
  }
  
  type ShortFlags = StringDictionary[js.Array[String] | String]
  
  type TypeDefs_ = StringDictionary[TypeInfo]
  
  trait TypeInfo extends StObject {
    
    var `type`: js.Object
    
    def validate(data: CommandData, k: String, `val`: String): Boolean
  }
  object TypeInfo {
    
    inline def apply(`type`: js.Object, validate: (CommandData, String, String) => Boolean): TypeInfo = {
      val __obj = js.Dynamic.literal(validate = js.Any.fromFunction3(validate))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeInfo]
    }
    
    extension [Self <: TypeInfo](x: Self) {
      
      inline def setType(value: js.Object): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValidate(value: (CommandData, String, String) => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction3(value))
    }
  }
}
