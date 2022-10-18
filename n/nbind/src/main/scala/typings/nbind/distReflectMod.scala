package typings.nbind

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.nbind.distCommonMod.SignatureType
import typings.nbind.distTypeMod.TypeClass
import typings.nbind.distTypeMod.TypeFlags
import typings.nbind.distTypeMod.TypeSpec
import typings.nbind.mod.Binding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distReflectMod {
  
  @JSImport("nbind/dist/reflect", "BindClass")
  @js.native
  open class BindClass protected () extends BindType {
    def this(spec: TypeSpec) = this()
    
    def addMethod(name: String, kind: SignatureType, typeList: js.Array[BindType], policyList: js.Array[String]): Unit = js.native
    
    def addProperty(name: String, kind: SignatureType, typeList: js.Array[BindType], policyList: js.Array[String]): Unit = js.native
    
    def addSuper(superClass: BindClass): Unit = js.native
    
    var methodList: js.Array[BindMethod] = js.native
    
    var methodTbl: StringDictionary[BindMethod] = js.native
    
    var propertyList: js.Array[BindProperty] = js.native
    
    var propertyTbl: StringDictionary[BindProperty] = js.native
    
    var superList: js.Array[BindClass] = js.native
  }
  
  @JSImport("nbind/dist/reflect", "BindMethod")
  @js.native
  open class BindMethod protected () extends StObject {
    def this(
      bindClass: BindClass,
      name: String,
      returnType: BindType,
      argTypeList: js.Array[BindType],
      policyList: js.Array[String],
      isStatic: Boolean
    ) = this()
    
    var argTypeList: js.Array[BindType] = js.native
    
    var bindClass: BindClass = js.native
    
    var isStatic: Boolean = js.native
    
    var name: String = js.native
    
    var policyList: js.Array[String] = js.native
    
    var returnType: BindType = js.native
  }
  
  @JSImport("nbind/dist/reflect", "BindProperty")
  @js.native
  open class BindProperty protected () extends StObject {
    def this(bindClass: BindClass, name: String) = this()
    
    var bindClass: BindClass = js.native
    
    var bindType: BindType = js.native
    
    var isReadable: Boolean = js.native
    
    var isWritable: Boolean = js.native
    
    def makeReadable(bindType: BindType): Unit = js.native
    
    def makeWritable(bindType: BindType): Unit = js.native
    
    var name: String = js.native
  }
  
  @JSImport("nbind/dist/reflect", "BindType")
  @js.native
  open class BindType protected ()
    extends StObject
       with TypeClass {
    def this(spec: TypeSpec) = this()
    
    /* CompleteClass */
    var flags: TypeFlags = js.native
    
    /* CompleteClass */
    var id: Double = js.native
    
    var isClass: Boolean = js.native
    
    /* CompleteClass */
    @JSName("name")
    var name_TypeClass: String = js.native
    
    /* CompleteClass */
    var spec: TypeSpec = js.native
  }
  
  @JSImport("nbind/dist/reflect", "Reflect")
  @js.native
  open class Reflect protected () extends StObject {
    def this(binding: Binding[Any]) = this()
    
    var binding: Binding[Any] = js.native
    
    var classList: js.Array[BindClass] = js.native
    
    /* private */ var constructType: Any = js.native
    
    def dumpPseudo(): String = js.native
    
    /* private */ def getType(id: Any): Any = js.native
    
    var globalScope: BindClass = js.native
    
    /* private */ def queryType(id: Any): Any = js.native
    
    /* private */ def readClass(id: Any, name: Any): Any = js.native
    
    /* private */ def readMethod(classId: Any, name: Any, kind: Any, typeIdList: Any, policyList: Any): Any = js.native
    
    /* private */ def readPrimitive(id: Any, size: Any, flags: Any): Any = js.native
    
    /* private */ def readSuper(classId: Any, superIdList: Any): Any = js.native
    
    /* private */ def readType(id: Any, name: Any): Any = js.native
    
    var skipNameTbl: StringDictionary[Boolean] = js.native
    
    var typeIdTbl: NumberDictionary[BindType] = js.native
    
    var typeNameTbl: StringDictionary[BindType] = js.native
  }
  
  @JSImport("nbind/dist/reflect", "TypeBase")
  @js.native
  val TypeBase: Instantiable1[/* spec */ TypeSpec, TypeClass] = js.native
  type TypeBase = TypeClass
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("nbind/dist/reflect", "TypeBase")
  @js.native
  open class TypeBaseCls protected ()
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
}
