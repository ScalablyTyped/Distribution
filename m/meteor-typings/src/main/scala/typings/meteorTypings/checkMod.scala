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
    def Any: js.Any = js.native
    inline def Any_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Any")(x.asInstanceOf[js.Any])
    
    @JSImport("meteor/check", "Match.Boolean")
    @js.native
    def Boolean: js.Any = js.native
    inline def Boolean_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Boolean")(x.asInstanceOf[js.Any])
    
    @JSImport("meteor/check", "Match.Integer")
    @js.native
    def Integer: js.Any = js.native
    inline def Integer_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Integer")(x.asInstanceOf[js.Any])
    
    inline def Maybe(pattern: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("Maybe")(pattern.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @JSImport("meteor/check", "Match.Object")
    @js.native
    def Object: js.Any = js.native
    
    inline def ObjectIncluding(dico: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("ObjectIncluding")(dico.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def Object_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Object")(x.asInstanceOf[js.Any])
    
    inline def OneOf(patterns: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("OneOf")(patterns.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def Optional(pattern: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("Optional")(pattern.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @JSImport("meteor/check", "Match.String")
    @js.native
    def String: js.Any = js.native
    inline def String_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("String")(x.asInstanceOf[js.Any])
    
    inline def Where(condition: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Where")(condition.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def test(value: js.Any, pattern: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("meteor/check", "Match.undefined")
    @js.native
    def undefined: js.Any = js.native
    inline def undefined_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("undefined")(x.asInstanceOf[js.Any])
  }
  
  inline def check(value: js.Any, pattern: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
