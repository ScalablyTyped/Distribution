package typings.meteorTypings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkMod {
  
  @JSImport("meteor/check", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Match {
    
    @JSImport("meteor/check", "Match")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("meteor/check", "Match.Any")
    @js.native
    def Any: scala.Any = js.native
    inline def Any_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Any")(x.asInstanceOf[js.Any])
    
    @JSImport("meteor/check", "Match.Boolean")
    @js.native
    def Boolean: Any = js.native
    inline def Boolean_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Boolean")(x.asInstanceOf[js.Any])
    
    @JSImport("meteor/check", "Match.Integer")
    @js.native
    def Integer: Any = js.native
    inline def Integer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Integer")(x.asInstanceOf[js.Any])
    
    inline def Maybe(pattern: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("Maybe")(pattern.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @JSImport("meteor/check", "Match.Object")
    @js.native
    def Object: Any = js.native
    
    inline def ObjectIncluding(dico: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("ObjectIncluding")(dico.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def Object_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Object")(x.asInstanceOf[js.Any])
    
    inline def OneOf(patterns: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("OneOf")(patterns.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    inline def Optional(pattern: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("Optional")(pattern.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @JSImport("meteor/check", "Match.String")
    @js.native
    def String: Any = js.native
    inline def String_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("String")(x.asInstanceOf[js.Any])
    
    inline def Where(condition: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Where")(condition.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def test(value: Any, pattern: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("meteor/check", "Match.undefined")
    @js.native
    def undefined: Any = js.native
    inline def undefined_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("undefined")(x.asInstanceOf[js.Any])
  }
  
  inline def check(value: Any, pattern: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
