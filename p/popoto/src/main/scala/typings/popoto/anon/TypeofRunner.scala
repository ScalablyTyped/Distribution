package typings.popoto.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofRunner extends StObject {
  
  var DRIVER: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Driver */ Any
  
  def createSession(): Any
  
  def run(statements: js.Array[Parameters]): Unit
  
  def toObject(
    results: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Result */ Any
    ]
  ): js.Array[js.Array[Any]]
}
object TypeofRunner {
  
  inline def apply(
    DRIVER: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Driver */ Any,
    createSession: () => Any,
    run: js.Array[Parameters] => Unit,
    toObject: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Result */ Any
    ] => js.Array[js.Array[Any]]
  ): TypeofRunner = {
    val __obj = js.Dynamic.literal(DRIVER = DRIVER.asInstanceOf[js.Any], createSession = js.Any.fromFunction0(createSession), run = js.Any.fromFunction1(run), toObject = js.Any.fromFunction1(toObject))
    __obj.asInstanceOf[TypeofRunner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofRunner] (val x: Self) extends AnyVal {
    
    inline def setCreateSession(value: () => Any): Self = StObject.set(x, "createSession", js.Any.fromFunction0(value))
    
    inline def setDRIVER(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Driver */ Any
    ): Self = StObject.set(x, "DRIVER", value.asInstanceOf[js.Any])
    
    inline def setRun(value: js.Array[Parameters] => Unit): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
    
    inline def setToObject(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Result */ Any
        ] => js.Array[js.Array[Any]]
    ): Self = StObject.set(x, "toObject", js.Any.fromFunction1(value))
  }
}
