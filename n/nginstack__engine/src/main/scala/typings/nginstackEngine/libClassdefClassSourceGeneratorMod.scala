package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClassdefClassSourceGeneratorMod {
  
  inline def apply(mimeType: Any): Unit = ^.asInstanceOf[js.Dynamic].apply(mimeType.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/classdef/ClassSourceGenerator", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with ClassSourceGenerator {
    def this(mimeType: Any) = this()
    
    /* private */ /* CompleteClass */
    var _classe: Any = js.native
    
    /* private */ /* CompleteClass */
    var _getIncludesOnceOfSource: Any = js.native
    
    /* private */ /* CompleteClass */
    var _getSourceParts: Any = js.native
    
    /* private */ /* CompleteClass */
    var _iVfs: Any = js.native
    
    /* private */ /* CompleteClass */
    var _mimeType: Any = js.native
    
    /* CompleteClass */
    override def getClassDefFunctionSource(classKey: Any): String = js.native
    
    /* CompleteClass */
    override def getSource(classKey: Double): String = js.native
  }
  @JSImport("@nginstack/engine/lib/classdef/ClassSourceGenerator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ClassSourceGenerator extends StObject {
    
    /* private */ var _classe: Any
    
    /* private */ var _getIncludesOnceOfSource: Any
    
    /* private */ var _getSourceParts: Any
    
    /* private */ var _iVfs: Any
    
    /* private */ var _mimeType: Any
    
    def getClassDefFunctionSource(classKey: Any): String
    
    def getSource(classKey: Double): String
  }
  object ClassSourceGenerator {
    
    inline def apply(
      _classe: Any,
      _getIncludesOnceOfSource: Any,
      _getSourceParts: Any,
      _iVfs: Any,
      _mimeType: Any,
      getClassDefFunctionSource: Any => String,
      getSource: Double => String
    ): ClassSourceGenerator = {
      val __obj = js.Dynamic.literal(_classe = _classe.asInstanceOf[js.Any], _getIncludesOnceOfSource = _getIncludesOnceOfSource.asInstanceOf[js.Any], _getSourceParts = _getSourceParts.asInstanceOf[js.Any], _iVfs = _iVfs.asInstanceOf[js.Any], _mimeType = _mimeType.asInstanceOf[js.Any], getClassDefFunctionSource = js.Any.fromFunction1(getClassDefFunctionSource), getSource = js.Any.fromFunction1(getSource))
      __obj.asInstanceOf[ClassSourceGenerator]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClassSourceGenerator] (val x: Self) extends AnyVal {
      
      inline def setGetClassDefFunctionSource(value: Any => String): Self = StObject.set(x, "getClassDefFunctionSource", js.Any.fromFunction1(value))
      
      inline def setGetSource(value: Double => String): Self = StObject.set(x, "getSource", js.Any.fromFunction1(value))
      
      inline def set_classe(value: Any): Self = StObject.set(x, "_classe", value.asInstanceOf[js.Any])
      
      inline def set_getIncludesOnceOfSource(value: Any): Self = StObject.set(x, "_getIncludesOnceOfSource", value.asInstanceOf[js.Any])
      
      inline def set_getSourceParts(value: Any): Self = StObject.set(x, "_getSourceParts", value.asInstanceOf[js.Any])
      
      inline def set_iVfs(value: Any): Self = StObject.set(x, "_iVfs", value.asInstanceOf[js.Any])
      
      inline def set_mimeType(value: Any): Self = StObject.set(x, "_mimeType", value.asInstanceOf[js.Any])
    }
  }
}
