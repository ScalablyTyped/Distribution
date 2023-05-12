package typings.photoshop.domCoreModulesMod

import typings.photoshop.photoshopStrings.always
import typings.photoshop.photoshopStrings.display
import typings.photoshop.photoshopStrings.dontDisplay
import typings.photoshop.photoshopStrings.execute
import typings.photoshop.photoshopStrings.fail
import typings.photoshop.photoshopStrings.never
import typings.photoshop.photoshopStrings.normal
import typings.photoshop.photoshopStrings.silent
import typings.photoshop.photoshopStrings.wait
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchPlayCommandOptions extends StObject {
  
  /**
    * @minVersion 23.0
    */
  var commandEnablement: js.UndefOr[normal | never | always] = js.undefined
  
  /**
    * @minVersion 23.0
    */
  var dialogOptions: js.UndefOr[silent | dontDisplay | display] = js.undefined
  
  /**
    * @minVersion 23.0
    */
  var modalBehavior: js.UndefOr[wait | execute | fail] = js.undefined
  
  /**
    * @minVersion 23.0
    */
  var propagateErrorToDefaultHandler: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @minVersion 23.0
    */
  var suppressPlayLevelIncrease: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @minVersion 23.0
    */
  var synchronousExecution: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @minVersion 23.0
    */
  var useMultiGet: js.UndefOr[Boolean] = js.undefined
}
object BatchPlayCommandOptions {
  
  inline def apply(): BatchPlayCommandOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchPlayCommandOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchPlayCommandOptions] (val x: Self) extends AnyVal {
    
    inline def setCommandEnablement(value: normal | never | always): Self = StObject.set(x, "commandEnablement", value.asInstanceOf[js.Any])
    
    inline def setCommandEnablementUndefined: Self = StObject.set(x, "commandEnablement", js.undefined)
    
    inline def setDialogOptions(value: silent | dontDisplay | display): Self = StObject.set(x, "dialogOptions", value.asInstanceOf[js.Any])
    
    inline def setDialogOptionsUndefined: Self = StObject.set(x, "dialogOptions", js.undefined)
    
    inline def setModalBehavior(value: wait | execute | fail): Self = StObject.set(x, "modalBehavior", value.asInstanceOf[js.Any])
    
    inline def setModalBehaviorUndefined: Self = StObject.set(x, "modalBehavior", js.undefined)
    
    inline def setPropagateErrorToDefaultHandler(value: Boolean): Self = StObject.set(x, "propagateErrorToDefaultHandler", value.asInstanceOf[js.Any])
    
    inline def setPropagateErrorToDefaultHandlerUndefined: Self = StObject.set(x, "propagateErrorToDefaultHandler", js.undefined)
    
    inline def setSuppressPlayLevelIncrease(value: Boolean): Self = StObject.set(x, "suppressPlayLevelIncrease", value.asInstanceOf[js.Any])
    
    inline def setSuppressPlayLevelIncreaseUndefined: Self = StObject.set(x, "suppressPlayLevelIncrease", js.undefined)
    
    inline def setSynchronousExecution(value: Boolean): Self = StObject.set(x, "synchronousExecution", value.asInstanceOf[js.Any])
    
    inline def setSynchronousExecutionUndefined: Self = StObject.set(x, "synchronousExecution", js.undefined)
    
    inline def setUseMultiGet(value: Boolean): Self = StObject.set(x, "useMultiGet", value.asInstanceOf[js.Any])
    
    inline def setUseMultiGetUndefined: Self = StObject.set(x, "useMultiGet", js.undefined)
  }
}
