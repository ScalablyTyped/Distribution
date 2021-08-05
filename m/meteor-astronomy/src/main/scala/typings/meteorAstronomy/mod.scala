package typings.meteorAstronomy

import typings.meteorAstronomy.MeteorAstronomy.ClassModel
import typings.meteorAstronomy.MeteorAstronomy.EnumModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // tslint:disable-line:no-single-declare-module
  object Class {
    
    @JSImport("meteor/jagi:astronomy", "Class")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create[T /* <: js.Object */](model: ClassModel[T]): typings.meteorAstronomy.MeteorAstronomy.Class[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.meteorAstronomy.MeteorAstronomy.Class[T]]
  }
  
  object Enum {
    
    @JSImport("meteor/jagi:astronomy", "Enum")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create[T](model: EnumModel[T]): typings.meteorAstronomy.MeteorAstronomy.Enum[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.meteorAstronomy.MeteorAstronomy.Enum[T]]
  }
}
