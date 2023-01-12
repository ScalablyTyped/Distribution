package typings.nbind

import org.scalablytyped.runtime.Instantiable1
import typings.nbind.distTypeMod.TypeClass
import typings.nbind.distTypeMod.TypeFlags
import typings.nbind.distTypeMod.TypeSpec
import typings.nbind.distTypeMod.TypeSpecWithName
import typings.nbind.mod.ClassType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bindvalue extends StObject {
    
    def bind_value(name: String, proto: ClassType): Unit
  }
  object Bindvalue {
    
    inline def apply(bind_value: (String, ClassType) => Unit): Bindvalue = {
      val __obj = js.Dynamic.literal(bind_value = js.Any.fromFunction2(bind_value))
      __obj.asInstanceOf[Bindvalue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Bindvalue] (val x: Self) extends AnyVal {
      
      inline def setBind_value(value: (String, ClassType) => Unit): Self = StObject.set(x, "bind_value", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait GetComplexType extends StObject {
    
    var Type: Instantiable1[/* spec */ TypeSpec, TypeClass] = js.native
    
    def getComplexType[BindType /* <: TypeClass */](
      id: Double,
      constructType: js.Function2[/* kind */ TypeFlags, /* spec */ TypeSpecWithName, BindType],
      getType: js.Function1[/* id */ Double, BindType],
      queryType: js.Function1[/* id */ Double, ParamList]
    ): BindType = js.native
    def getComplexType[BindType /* <: TypeClass */](
      id: Double,
      constructType: js.Function2[/* kind */ TypeFlags, /* spec */ TypeSpecWithName, BindType],
      getType: js.Function1[/* id */ Double, BindType],
      queryType: js.Function1[/* id */ Double, ParamList],
      place: String
    ): BindType = js.native
    def getComplexType[BindType /* <: TypeClass */](
      id: Double,
      constructType: js.Function2[/* kind */ TypeFlags, /* spec */ TypeSpecWithName, BindType],
      getType: js.Function1[/* id */ Double, BindType],
      queryType: js.Function1[/* id */ Double, ParamList],
      place: String,
      kind: String
    ): BindType = js.native
    def getComplexType[BindType /* <: TypeClass */](
      id: Double,
      constructType: js.Function2[/* kind */ TypeFlags, /* spec */ TypeSpecWithName, BindType],
      getType: js.Function1[/* id */ Double, BindType],
      queryType: js.Function1[/* id */ Double, ParamList],
      place: String,
      kind: String,
      prevStructure: js.Tuple3[TypeFlags, Double, String]
    ): BindType = js.native
    def getComplexType[BindType /* <: TypeClass */](
      id: Double,
      constructType: js.Function2[/* kind */ TypeFlags, /* spec */ TypeSpecWithName, BindType],
      getType: js.Function1[/* id */ Double, BindType],
      queryType: js.Function1[/* id */ Double, ParamList],
      place: String,
      kind: String,
      prevStructure: js.Tuple3[TypeFlags, Double, String],
      depth: Double
    ): BindType = js.native
    def getComplexType[BindType /* <: TypeClass */](
      id: Double,
      constructType: js.Function2[/* kind */ TypeFlags, /* spec */ TypeSpecWithName, BindType],
      getType: js.Function1[/* id */ Double, BindType],
      queryType: js.Function1[/* id */ Double, ParamList],
      place: String,
      kind: String,
      prevStructure: Unit,
      depth: Double
    ): BindType = js.native
    def getComplexType[BindType /* <: TypeClass */](
      id: Double,
      constructType: js.Function2[/* kind */ TypeFlags, /* spec */ TypeSpecWithName, BindType],
      getType: js.Function1[/* id */ Double, BindType],
      queryType: js.Function1[/* id */ Double, ParamList],
      place: String,
      kind: Unit,
      prevStructure: js.Tuple3[TypeFlags, Double, String]
    ): BindType = js.native
    def getComplexType[BindType /* <: TypeClass */](
      id: Double,
      constructType: js.Function2[/* kind */ TypeFlags, /* spec */ TypeSpecWithName, BindType],
      getType: js.Function1[/* id */ Double, BindType],
      queryType: js.Function1[/* id */ Double, ParamList],
      place: String,
      kind: Unit,
      prevStructure: js.Tuple3[TypeFlags, Double, String],
      depth: Double
    ): BindType = js.native
    def getComplexType[BindType /* <: TypeClass */](
      id: Double,
      constructType: js.Function2[/* kind */ TypeFlags, /* spec */ TypeSpecWithName, BindType],
      getType: js.Function1[/* id */ Double, BindType],
      queryType: js.Function1[/* id */ Double, ParamList],
      place: String,
      kind: Unit,
      prevStructure: Unit,
      depth: Double
    ): BindType = js.native
    def getComplexType[BindType /* <: TypeClass */](
      id: Double,
      constructType: js.Function2[/* kind */ TypeFlags, /* spec */ TypeSpecWithName, BindType],
      getType: js.Function1[/* id */ Double, BindType],
      queryType: js.Function1[/* id */ Double, ParamList],
      place: Unit,
      kind: String
    ): BindType = js.native
    def getComplexType[BindType /* <: TypeClass */](
      id: Double,
      constructType: js.Function2[/* kind */ TypeFlags, /* spec */ TypeSpecWithName, BindType],
      getType: js.Function1[/* id */ Double, BindType],
      queryType: js.Function1[/* id */ Double, ParamList],
      place: Unit,
      kind: String,
      prevStructure: js.Tuple3[TypeFlags, Double, String]
    ): BindType = js.native
    def getComplexType[BindType /* <: TypeClass */](
      id: Double,
      constructType: js.Function2[/* kind */ TypeFlags, /* spec */ TypeSpecWithName, BindType],
      getType: js.Function1[/* id */ Double, BindType],
      queryType: js.Function1[/* id */ Double, ParamList],
      place: Unit,
      kind: String,
      prevStructure: js.Tuple3[TypeFlags, Double, String],
      depth: Double
    ): BindType = js.native
    def getComplexType[BindType /* <: TypeClass */](
      id: Double,
      constructType: js.Function2[/* kind */ TypeFlags, /* spec */ TypeSpecWithName, BindType],
      getType: js.Function1[/* id */ Double, BindType],
      queryType: js.Function1[/* id */ Double, ParamList],
      place: Unit,
      kind: String,
      prevStructure: Unit,
      depth: Double
    ): BindType = js.native
    def getComplexType[BindType /* <: TypeClass */](
      id: Double,
      constructType: js.Function2[/* kind */ TypeFlags, /* spec */ TypeSpecWithName, BindType],
      getType: js.Function1[/* id */ Double, BindType],
      queryType: js.Function1[/* id */ Double, ParamList],
      place: Unit,
      kind: Unit,
      prevStructure: js.Tuple3[TypeFlags, Double, String]
    ): BindType = js.native
    def getComplexType[BindType /* <: TypeClass */](
      id: Double,
      constructType: js.Function2[/* kind */ TypeFlags, /* spec */ TypeSpecWithName, BindType],
      getType: js.Function1[/* id */ Double, BindType],
      queryType: js.Function1[/* id */ Double, ParamList],
      place: Unit,
      kind: Unit,
      prevStructure: js.Tuple3[TypeFlags, Double, String],
      depth: Double
    ): BindType = js.native
    def getComplexType[BindType /* <: TypeClass */](
      id: Double,
      constructType: js.Function2[/* kind */ TypeFlags, /* spec */ TypeSpecWithName, BindType],
      getType: js.Function1[/* id */ Double, BindType],
      queryType: js.Function1[/* id */ Double, ParamList],
      place: Unit,
      kind: Unit,
      prevStructure: Unit,
      depth: Double
    ): BindType = js.native
    
    def makeType[BindType /* <: TypeClass */](
      constructType: js.Function2[/* kind */ TypeFlags, /* spec */ TypeSpecWithName, BindType],
      spec: TypeSpec
    ): BindType = js.native
    
    var structureList: js.Array[js.Tuple3[TypeFlags, Double, String]] = js.native
  }
  
  trait ParamList extends StObject {
    
    var paramList: js.Array[Double | js.Array[Double]]
    
    var placeholderFlag: Double
  }
  object ParamList {
    
    inline def apply(paramList: js.Array[Double | js.Array[Double]], placeholderFlag: Double): ParamList = {
      val __obj = js.Dynamic.literal(paramList = paramList.asInstanceOf[js.Any], placeholderFlag = placeholderFlag.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParamList]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParamList] (val x: Self) extends AnyVal {
      
      inline def setParamList(value: js.Array[Double | js.Array[Double]]): Self = StObject.set(x, "paramList", value.asInstanceOf[js.Any])
      
      inline def setParamListVarargs(value: (Double | js.Array[Double])*): Self = StObject.set(x, "paramList", js.Array(value*))
      
      inline def setPlaceholderFlag(value: Double): Self = StObject.set(x, "placeholderFlag", value.asInstanceOf[js.Any])
    }
  }
  
  trait Reflect extends StObject {
    
    var reflect: typings.nbind.distReflectMod.Reflect
    
    var shim: js.UndefOr[Boolean] = js.undefined
  }
  object Reflect {
    
    inline def apply(reflect: typings.nbind.distReflectMod.Reflect): Reflect = {
      val __obj = js.Dynamic.literal(reflect = reflect.asInstanceOf[js.Any])
      __obj.asInstanceOf[Reflect]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Reflect] (val x: Self) extends AnyVal {
      
      inline def setReflect(value: typings.nbind.distReflectMod.Reflect): Self = StObject.set(x, "reflect", value.asInstanceOf[js.Any])
      
      inline def setShim(value: Boolean): Self = StObject.set(x, "shim", value.asInstanceOf[js.Any])
      
      inline def setShimUndefined: Self = StObject.set(x, "shim", js.undefined)
    }
  }
}
