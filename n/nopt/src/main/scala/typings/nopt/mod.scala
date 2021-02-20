package typings.nopt

import org.scalablytyped.runtime.StringDictionary
import typings.nopt.anon.Cooked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nopt", JSImport.Namespace)
  @js.native
  def apply(types: FlagTypeMap): OptionsParsed = js.native
  @JSImport("nopt", JSImport.Namespace)
  @js.native
  def apply(
    types: FlagTypeMap,
    shorthands: js.UndefOr[scala.Nothing],
    args: js.UndefOr[scala.Nothing],
    slice: Double
  ): OptionsParsed = js.native
  @JSImport("nopt", JSImport.Namespace)
  @js.native
  def apply(types: FlagTypeMap, shorthands: js.UndefOr[scala.Nothing], args: js.Array[String]): OptionsParsed = js.native
  @JSImport("nopt", JSImport.Namespace)
  @js.native
  def apply(types: FlagTypeMap, shorthands: js.UndefOr[scala.Nothing], args: js.Array[String], slice: Double): OptionsParsed = js.native
  @JSImport("nopt", JSImport.Namespace)
  @js.native
  def apply(types: FlagTypeMap, shorthands: ShortFlags): OptionsParsed = js.native
  @JSImport("nopt", JSImport.Namespace)
  @js.native
  def apply(types: FlagTypeMap, shorthands: ShortFlags, args: js.UndefOr[scala.Nothing], slice: Double): OptionsParsed = js.native
  @JSImport("nopt", JSImport.Namespace)
  @js.native
  def apply(types: FlagTypeMap, shorthands: ShortFlags, args: js.Array[String]): OptionsParsed = js.native
  @JSImport("nopt", JSImport.Namespace)
  @js.native
  def apply(types: FlagTypeMap, shorthands: ShortFlags, args: js.Array[String], slice: Double): OptionsParsed = js.native
  
  @JSImport("nopt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("nopt", "clean")
  @js.native
  def clean(data: CommandData, types: FlagTypeMap): String = js.native
  @JSImport("nopt", "clean")
  @js.native
  def clean(data: CommandData, types: FlagTypeMap, typeDefs: TypeDefs_): String = js.native
  
  @JSImport("nopt", "typeDefs")
  @js.native
  def typeDefs: TypeDefs_ = js.native
  @scala.inline
  def typeDefs_=(x: TypeDefs_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typeDefs")(x.asInstanceOf[js.Any])
  
  type CommandData = StringDictionary[String]
  
  type FlagTypeMap = StringDictionary[js.Object]
  
  @js.native
  trait OptionsParsed
    extends /* k */ StringDictionary[js.Any] {
    
    var argv: Cooked = js.native
  }
  object OptionsParsed {
    
    @scala.inline
    def apply(argv: Cooked): OptionsParsed = {
      val __obj = js.Dynamic.literal(argv = argv.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsParsed]
    }
    
    @scala.inline
    implicit class OptionsParsedMutableBuilder[Self <: OptionsParsed] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgv(value: Cooked): Self = StObject.set(x, "argv", value.asInstanceOf[js.Any])
    }
  }
  
  type ShortFlags = StringDictionary[js.Array[String] | String]
  
  type TypeDefs_ = StringDictionary[TypeInfo]
  
  @js.native
  trait TypeInfo extends StObject {
    
    var `type`: js.Object = js.native
    
    def validate(data: CommandData, k: String, `val`: String): Boolean = js.native
  }
  object TypeInfo {
    
    @scala.inline
    def apply(`type`: js.Object, validate: (CommandData, String, String) => Boolean): TypeInfo = {
      val __obj = js.Dynamic.literal(validate = js.Any.fromFunction3(validate))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeInfo]
    }
    
    @scala.inline
    implicit class TypeInfoMutableBuilder[Self <: TypeInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: js.Object): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidate(value: (CommandData, String, String) => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction3(value))
    }
  }
}
