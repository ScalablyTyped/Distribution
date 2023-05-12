package typings.postcssCustomMedia

import typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod.MediaQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DependsOn extends StObject {
    
    var dependsOn: js.Array[js.Tuple2[String, String]]
    
    var falsy: js.Array[MediaQuery]
    
    var name: String
    
    var truthy: js.Array[MediaQuery]
  }
  object DependsOn {
    
    inline def apply(
      dependsOn: js.Array[js.Tuple2[String, String]],
      falsy: js.Array[MediaQuery],
      name: String,
      truthy: js.Array[MediaQuery]
    ): DependsOn = {
      val __obj = js.Dynamic.literal(dependsOn = dependsOn.asInstanceOf[js.Any], falsy = falsy.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], truthy = truthy.asInstanceOf[js.Any])
      __obj.asInstanceOf[DependsOn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DependsOn] (val x: Self) extends AnyVal {
      
      inline def setDependsOn(value: js.Array[js.Tuple2[String, String]]): Self = StObject.set(x, "dependsOn", value.asInstanceOf[js.Any])
      
      inline def setDependsOnVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "dependsOn", js.Array(value*))
      
      inline def setFalsy(value: js.Array[MediaQuery]): Self = StObject.set(x, "falsy", value.asInstanceOf[js.Any])
      
      inline def setFalsyVarargs(value: MediaQuery*): Self = StObject.set(x, "falsy", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTruthy(value: js.Array[MediaQuery]): Self = StObject.set(x, "truthy", value.asInstanceOf[js.Any])
      
      inline def setTruthyVarargs(value: MediaQuery*): Self = StObject.set(x, "truthy", js.Array(value*))
    }
  }
  
  trait EncapsulateWith extends StObject {
    
    var encapsulateWith: js.UndefOr[String] = js.undefined
    
    var replaceWith: String
  }
  object EncapsulateWith {
    
    inline def apply(replaceWith: String): EncapsulateWith = {
      val __obj = js.Dynamic.literal(replaceWith = replaceWith.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncapsulateWith]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EncapsulateWith] (val x: Self) extends AnyVal {
      
      inline def setEncapsulateWith(value: String): Self = StObject.set(x, "encapsulateWith", value.asInstanceOf[js.Any])
      
      inline def setEncapsulateWithUndefined: Self = StObject.set(x, "encapsulateWith", js.undefined)
      
      inline def setReplaceWith(value: String): Self = StObject.set(x, "replaceWith", value.asInstanceOf[js.Any])
    }
  }
  
  trait Falsy extends StObject {
    
    var falsy: js.Array[MediaQuery]
    
    var truthy: js.Array[MediaQuery]
  }
  object Falsy {
    
    inline def apply(falsy: js.Array[MediaQuery], truthy: js.Array[MediaQuery]): Falsy = {
      val __obj = js.Dynamic.literal(falsy = falsy.asInstanceOf[js.Any], truthy = truthy.asInstanceOf[js.Any])
      __obj.asInstanceOf[Falsy]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Falsy] (val x: Self) extends AnyVal {
      
      inline def setFalsy(value: js.Array[MediaQuery]): Self = StObject.set(x, "falsy", value.asInstanceOf[js.Any])
      
      inline def setFalsyVarargs(value: MediaQuery*): Self = StObject.set(x, "falsy", js.Array(value*))
      
      inline def setTruthy(value: js.Array[MediaQuery]): Self = StObject.set(x, "truthy", value.asInstanceOf[js.Any])
      
      inline def setTruthyVarargs(value: MediaQuery*): Self = StObject.set(x, "truthy", js.Array(value*))
    }
  }
  
  trait Preserve extends StObject {
    
    var preserve: js.UndefOr[Boolean] = js.undefined
  }
  object Preserve {
    
    inline def apply(): Preserve = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Preserve]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Preserve] (val x: Self) extends AnyVal {
      
      inline def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
      
      inline def setPreserveUndefined: Self = StObject.set(x, "preserve", js.undefined)
    }
  }
}
