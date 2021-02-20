package typings.meteorAstronomy

import typings.meteorAstronomy.MeteorAstronomy.ClassModel
import typings.meteorAstronomy.MeteorAstronomy.EnumModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // tslint:disable-line:no-single-declare-module
  object Class {
    
    @JSImport("meteor/jagi:astronomy", "Class.create")
    @js.native
    def create[T /* <: js.Object */](model: ClassModel[T]): typings.meteorAstronomy.MeteorAstronomy.Class[T] = js.native
  }
  
  object Enum {
    
    @JSImport("meteor/jagi:astronomy", "Enum.create")
    @js.native
    def create[T](model: EnumModel[T]): typings.meteorAstronomy.MeteorAstronomy.Enum[T] = js.native
  }
}
