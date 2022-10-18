package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTestingAssertMod {
  
  @JSImport("@nginstack/engine/lib/testing/assert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/engine/lib/testing/assert", "AssertionError")
  @js.native
  /* private */ open class AssertionError () extends StObject {
    
    /* private */ var _details: Any = js.native
    
    /* private */ var _error: Any = js.native
    
    /* private */ var _name: Any = js.native
  }
  object AssertionError {
    
    @JSImport("@nginstack/engine/lib/testing/assert", "AssertionError")
    @js.native
    def apply(options: Any): Unit = js.native
  }
  
  inline def equal(value: Any, expected: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(value.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def equal(value: Any, expected: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(value.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fail(): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("fail")().asInstanceOf[scala.Nothing]
  inline def fail(message: String): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("fail")(message.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  inline def notEqual(value: Any, expected: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(value.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def notEqual(value: Any, expected: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(value.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def notStrictEqual(value: Any, expected: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notStrictEqual")(value.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def notStrictEqual(value: Any, expected: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notStrictEqual")(value.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ok(value: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ok")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def ok(value: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ok")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def strictEqual(value: Any, expected: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("strictEqual")(value.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def strictEqual(value: Any, expected: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("strictEqual")(value.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def throwsExceptions(func: js.Function0[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("throwsExceptions")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def throwsExceptions(func: js.Function0[Any], message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throwsExceptions")(func.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
