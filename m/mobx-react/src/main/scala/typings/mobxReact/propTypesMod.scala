package typings.mobxReact

import typings.react.mod.Requireable
import typings.react.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propTypesMod {
  
  object PropTypes {
    
    @JSImport("mobx-react/dist/propTypes", "PropTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mobx-react/dist/propTypes", "PropTypes.arrayOrObservableArray")
    @js.native
    def arrayOrObservableArray: Requireable[js.Any] = js.native
    
    inline def arrayOrObservableArrayOf(typeChecker: Validator[js.Any]): Requireable[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayOrObservableArrayOf")(typeChecker.asInstanceOf[js.Any]).asInstanceOf[Requireable[js.Any]]
    
    inline def arrayOrObservableArray_=(x: Requireable[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arrayOrObservableArray")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-react/dist/propTypes", "PropTypes.objectOrObservableObject")
    @js.native
    def objectOrObservableObject: Requireable[js.Any] = js.native
    inline def objectOrObservableObject_=(x: Requireable[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("objectOrObservableObject")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-react/dist/propTypes", "PropTypes.observableArray")
    @js.native
    def observableArray: Requireable[js.Any] = js.native
    
    inline def observableArrayOf(typeChecker: Validator[js.Any]): Requireable[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("observableArrayOf")(typeChecker.asInstanceOf[js.Any]).asInstanceOf[Requireable[js.Any]]
    
    inline def observableArray_=(x: Requireable[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("observableArray")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-react/dist/propTypes", "PropTypes.observableMap")
    @js.native
    def observableMap: Requireable[js.Any] = js.native
    inline def observableMap_=(x: Requireable[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("observableMap")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-react/dist/propTypes", "PropTypes.observableObject")
    @js.native
    def observableObject: Requireable[js.Any] = js.native
    inline def observableObject_=(x: Requireable[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("observableObject")(x.asInstanceOf[js.Any])
  }
}
