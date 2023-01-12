package typings.nbind

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.nbind.anon.GetComplexType
import typings.nbind.nbindInts.`0`
import typings.nbind.nbindInts.`10240`
import typings.nbind.nbindInts.`1024`
import typings.nbind.nbindInts.`10`
import typings.nbind.nbindInts.`120`
import typings.nbind.nbindInts.`128`
import typings.nbind.nbindInts.`15360`
import typings.nbind.nbindInts.`16`
import typings.nbind.nbindInts.`1`
import typings.nbind.nbindInts.`2048`
import typings.nbind.nbindInts.`256`
import typings.nbind.nbindInts.`2`
import typings.nbind.nbindInts.`3072`
import typings.nbind.nbindInts.`32`
import typings.nbind.nbindInts.`384`
import typings.nbind.nbindInts.`3`
import typings.nbind.nbindInts.`4096`
import typings.nbind.nbindInts.`4`
import typings.nbind.nbindInts.`5120`
import typings.nbind.nbindInts.`512`
import typings.nbind.nbindInts.`5`
import typings.nbind.nbindInts.`6144`
import typings.nbind.nbindInts.`640`
import typings.nbind.nbindInts.`64`
import typings.nbind.nbindInts.`6`
import typings.nbind.nbindInts.`7168`
import typings.nbind.nbindInts.`7`
import typings.nbind.nbindInts.`8192`
import typings.nbind.nbindInts.`896`
import typings.nbind.nbindInts.`8`
import typings.nbind.nbindInts.`9216`
import typings.nbind.nbindInts.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypeMod {
  
  @JSImport("nbind/dist/Type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("nbind/dist/Type", "Type")
  @js.native
  open class Type protected ()
    extends StObject
       with TypeClass {
    def this(spec: TypeSpec) = this()
    
    /* CompleteClass */
    var flags: TypeFlags = js.native
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    @JSName("name")
    var name_TypeClass: String = js.native
    
    /* CompleteClass */
    var spec: TypeSpec = js.native
  }
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(makeType, structureList) */ @JSImport("nbind/dist/Type", "Type")
  @js.native
  val Type: Instantiable1[/* spec */ TypeSpec, TypeClass] = js.native
  
  inline def typeModule(self: Any): GetComplexType = ^.asInstanceOf[js.Dynamic].applyDynamic("typeModule")(self.asInstanceOf[js.Any]).asInstanceOf[GetComplexType]
  
  type PolicyTbl = StringDictionary[Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.nbind.nbindInts.`0`
    - typings.nbind.nbindInts.`1`
    - typings.nbind.nbindInts.`2`
  */
  trait StateFlags extends StObject
  object StateFlags {
    
    inline def isDeleted: `2` = 2.asInstanceOf[`2`]
    
    inline def isPersistent: `1` = 1.asInstanceOf[`1`]
    
    inline def none: `0` = 0.asInstanceOf[`0`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nbind.nbindInts.`0`
    - typings.nbind.nbindInts.`1`
    - typings.nbind.nbindInts.`2`
    - typings.nbind.nbindInts.`3`
    - typings.nbind.nbindInts.`4`
    - typings.nbind.nbindInts.`5`
    - typings.nbind.nbindInts.`6`
    - typings.nbind.nbindInts.`7`
    - typings.nbind.nbindInts.`8`
    - typings.nbind.nbindInts.`9`
    - typings.nbind.nbindInts.`10`
  */
  trait StructureType extends StObject
  object StructureType {
    
    inline def array: `8` = 8.asInstanceOf[`8`]
    
    inline def callback: `9` = 9.asInstanceOf[`9`]
    
    inline def constant: `1` = 1.asInstanceOf[`1`]
    
    inline def max: `10` = 10.asInstanceOf[`10`]
    
    inline def none: `0` = 0.asInstanceOf[`0`]
    
    inline def pointer: `2` = 2.asInstanceOf[`2`]
    
    inline def reference: `3` = 3.asInstanceOf[`3`]
    
    inline def rvalue: `4` = 4.asInstanceOf[`4`]
    
    inline def shared: `5` = 5.asInstanceOf[`5`]
    
    inline def unique: `6` = 6.asInstanceOf[`6`]
    
    inline def vector: `7` = 7.asInstanceOf[`7`]
  }
  
  trait TypeClass
    extends StObject
       with TypeSpec {
    
    var makeWireRead: js.UndefOr[
        js.Function3[
          /* expr */ String, 
          /* convertParamList */ js.UndefOr[js.Array[Any]], 
          /* num */ js.UndefOr[Double], 
          String
        ]
      ] = js.undefined
    
    var makeWireWrite: js.UndefOr[
        js.Function4[
          /* expr */ String, 
          /* policyTbl */ PolicyTbl | Null, 
          /* convertParamList */ js.UndefOr[js.Array[Any]], 
          /* num */ js.UndefOr[Double], 
          Boolean | String | (js.Function1[/* arg */ Any, Double | Boolean])
        ]
      ] = js.undefined
    
    @JSName("name")
    var name_TypeClass: String
    
    var spec: TypeSpec
    
    @JSName("toString")
    var toString_FTypeClass: js.UndefOr[js.Function0[String]] = js.undefined
    
    var wireRead: js.UndefOr[js.Function1[/* arg */ Double, Any]] = js.undefined
    
    var wireWrite: js.UndefOr[js.Function1[/* arg */ Any, Double]] = js.undefined
  }
  object TypeClass {
    
    inline def apply(flags: TypeFlags, id: Double, name: String, spec: TypeSpec): TypeClass = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeClass]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeClass] (val x: Self) extends AnyVal {
      
      inline def setMakeWireRead(
        value: (/* expr */ String, /* convertParamList */ js.UndefOr[js.Array[Any]], /* num */ js.UndefOr[Double]) => String
      ): Self = StObject.set(x, "makeWireRead", js.Any.fromFunction3(value))
      
      inline def setMakeWireReadUndefined: Self = StObject.set(x, "makeWireRead", js.undefined)
      
      inline def setMakeWireWrite(
        value: (/* expr */ String, /* policyTbl */ PolicyTbl | Null, /* convertParamList */ js.UndefOr[js.Array[Any]], /* num */ js.UndefOr[Double]) => Boolean | String | (js.Function1[/* arg */ Any, Double | Boolean])
      ): Self = StObject.set(x, "makeWireWrite", js.Any.fromFunction4(value))
      
      inline def setMakeWireWriteUndefined: Self = StObject.set(x, "makeWireWrite", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSpec(value: TypeSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setToString_(value: () => String): Self = StObject.set(x, "toString", js.Any.fromFunction0(value))
      
      inline def setToString_Undefined: Self = StObject.set(x, "toString", js.undefined)
      
      inline def setWireRead(value: /* arg */ Double => Any): Self = StObject.set(x, "wireRead", js.Any.fromFunction1(value))
      
      inline def setWireReadUndefined: Self = StObject.set(x, "wireRead", js.undefined)
      
      inline def setWireWrite(value: /* arg */ Any => Double): Self = StObject.set(x, "wireWrite", js.Any.fromFunction1(value))
      
      inline def setWireWriteUndefined: Self = StObject.set(x, "wireWrite", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nbind.nbindInts.`1`
    - typings.nbind.nbindInts.`8`
    - typings.nbind.nbindInts.`128`
    - typings.nbind.nbindInts.`1024`
  */
  trait TypeFlagBase extends StObject
  object TypeFlagBase {
    
    inline def flag: `1` = 1.asInstanceOf[`1`]
    
    inline def kind: `1024` = 1024.asInstanceOf[`1024`]
    
    inline def num: `8` = 8.asInstanceOf[`8`]
    
    inline def ref: `128` = 128.asInstanceOf[`128`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nbind.nbindInts.`0`
    - typings.nbind.nbindInts.`3`
    - typings.nbind.nbindInts.`1`
    - typings.nbind.nbindInts.`2`
    - typings.nbind.nbindInts.`4`
    - typings.nbind.nbindInts.`120`
    - typings.nbind.nbindInts.`8`
    - typings.nbind.nbindInts.`16`
    - typings.nbind.nbindInts.`32`
    - typings.nbind.nbindInts.`64`
    - typings.nbind.nbindInts.`896`
    - typings.nbind.nbindInts.`128`
    - typings.nbind.nbindInts.`256`
    - typings.nbind.nbindInts.`384`
    - typings.nbind.nbindInts.`512`
    - typings.nbind.nbindInts.`640`
    - typings.nbind.nbindInts.`15360`
    - typings.nbind.nbindInts.`1024`
    - typings.nbind.nbindInts.`2048`
    - typings.nbind.nbindInts.`3072`
    - typings.nbind.nbindInts.`4096`
    - typings.nbind.nbindInts.`5120`
    - typings.nbind.nbindInts.`6144`
    - typings.nbind.nbindInts.`7168`
    - typings.nbind.nbindInts.`8192`
    - typings.nbind.nbindInts.`9216`
    - typings.nbind.nbindInts.`10240`
  */
  trait TypeFlags extends StObject
  object TypeFlags {
    
    inline def flagMask: `3` = 3.asInstanceOf[`3`]
    
    inline def isArithmetic: `1024` = 1024.asInstanceOf[`1024`]
    
    inline def isArray: `6144` = 6144.asInstanceOf[`6144`]
    
    inline def isBig: `64` = 64.asInstanceOf[`64`]
    
    inline def isCString: `7168` = 7168.asInstanceOf[`7168`]
    
    inline def isCallback: `9216` = 9216.asInstanceOf[`9216`]
    
    inline def isClass: `2048` = 2048.asInstanceOf[`2048`]
    
    inline def isClassPtr: `3072` = 3072.asInstanceOf[`3072`]
    
    inline def isConst: `1` = 1.asInstanceOf[`1`]
    
    inline def isFloat: `32` = 32.asInstanceOf[`32`]
    
    inline def isMethod: `4` = 4.asInstanceOf[`4`]
    
    inline def isOther: `10240` = 10240.asInstanceOf[`10240`]
    
    inline def isPointer: `128` = 128.asInstanceOf[`128`]
    
    inline def isReference: `256` = 256.asInstanceOf[`256`]
    
    inline def isRvalueRef: `384` = 384.asInstanceOf[`384`]
    
    inline def isSharedClassPtr: `4096` = 4096.asInstanceOf[`4096`]
    
    inline def isSharedPtr: `512` = 512.asInstanceOf[`512`]
    
    inline def isSignless: `16` = 16.asInstanceOf[`16`]
    
    inline def isString: `8192` = 8192.asInstanceOf[`8192`]
    
    inline def isUniquePtr: `640` = 640.asInstanceOf[`640`]
    
    inline def isUnsigned: `8` = 8.asInstanceOf[`8`]
    
    inline def isValueObject: `2` = 2.asInstanceOf[`2`]
    
    inline def isVector: `5120` = 5120.asInstanceOf[`5120`]
    
    inline def kindMask: `15360` = 15360.asInstanceOf[`15360`]
    
    inline def none: `0` = 0.asInstanceOf[`0`]
    
    inline def numMask: `120` = 120.asInstanceOf[`120`]
    
    inline def refMask: `896` = 896.asInstanceOf[`896`]
  }
  
  trait TypeSpec
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var flags: TypeFlags
    
    var id: Double
    
    var name: js.UndefOr[String] = js.undefined
    
    var paramList: js.UndefOr[js.Array[TypeClass | Double]] = js.undefined
    
    var ptrSize: js.UndefOr[Double] = js.undefined
  }
  object TypeSpec {
    
    inline def apply(flags: TypeFlags, id: Double): TypeSpec = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeSpec]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeSpec] (val x: Self) extends AnyVal {
      
      inline def setFlags(value: TypeFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setParamList(value: js.Array[TypeClass | Double]): Self = StObject.set(x, "paramList", value.asInstanceOf[js.Any])
      
      inline def setParamListUndefined: Self = StObject.set(x, "paramList", js.undefined)
      
      inline def setParamListVarargs(value: (TypeClass | Double)*): Self = StObject.set(x, "paramList", js.Array(value*))
      
      inline def setPtrSize(value: Double): Self = StObject.set(x, "ptrSize", value.asInstanceOf[js.Any])
      
      inline def setPtrSizeUndefined: Self = StObject.set(x, "ptrSize", js.undefined)
    }
  }
  
  trait TypeSpecWithName
    extends StObject
       with TypeSpec {
    
    @JSName("name")
    var name_TypeSpecWithName: String
  }
  object TypeSpecWithName {
    
    inline def apply(flags: TypeFlags, id: Double, name: String): TypeSpecWithName = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeSpecWithName]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeSpecWithName] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeSpecWithParam
    extends StObject
       with TypeSpecWithName {
    
    @JSName("paramList")
    var paramList_TypeSpecWithParam: js.Array[TypeClass | Double]
  }
  object TypeSpecWithParam {
    
    inline def apply(flags: TypeFlags, id: Double, name: String, paramList: js.Array[TypeClass | Double]): TypeSpecWithParam = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], paramList = paramList.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeSpecWithParam]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeSpecWithParam] (val x: Self) extends AnyVal {
      
      inline def setParamList(value: js.Array[TypeClass | Double]): Self = StObject.set(x, "paramList", value.asInstanceOf[js.Any])
      
      inline def setParamListVarargs(value: (TypeClass | Double)*): Self = StObject.set(x, "paramList", js.Array(value*))
    }
  }
  
  trait TypeSpecWithSize
    extends StObject
       with TypeSpecWithName {
    
    @JSName("ptrSize")
    var ptrSize_TypeSpecWithSize: Double
  }
  object TypeSpecWithSize {
    
    inline def apply(flags: TypeFlags, id: Double, name: String, ptrSize: Double): TypeSpecWithSize = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ptrSize = ptrSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeSpecWithSize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeSpecWithSize] (val x: Self) extends AnyVal {
      
      inline def setPtrSize(value: Double): Self = StObject.set(x, "ptrSize", value.asInstanceOf[js.Any])
    }
  }
}
