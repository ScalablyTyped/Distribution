package typings.orbitUiReactComponents.anon

import typings.orbitUiReactComponents.useMergedRefsMod.MergedRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputProps extends StObject {
  
  var inputProps: Ariainvalid
  
  var inputRef: MergedRef[Any]
  
  var wrapperProps: Role
}
object InputProps {
  
  inline def apply(inputProps: Ariainvalid, inputRef: MergedRef[Any], wrapperProps: Role): InputProps = {
    val __obj = js.Dynamic.literal(inputProps = inputProps.asInstanceOf[js.Any], inputRef = inputRef.asInstanceOf[js.Any], wrapperProps = wrapperProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputProps]
  }
  
  extension [Self <: InputProps](x: Self) {
    
    inline def setInputProps(value: Ariainvalid): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
    
    inline def setInputRef(value: MergedRef[Any]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
    
    inline def setWrapperProps(value: Role): Self = StObject.set(x, "wrapperProps", value.asInstanceOf[js.Any])
  }
}
