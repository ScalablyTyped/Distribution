package typings.plottable

import typings.plottable.animatorMod.IAnimator
import typings.plottable.interfacesMod.AttributeToAppliedProjector
import typings.plottable.interfacesMod.AttributeToProjector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawStepMod {
  
  trait AppliedDrawStep extends StObject {
    
    var animator: IAnimator
    
    var attrToAppliedProjector: AttributeToAppliedProjector
  }
  object AppliedDrawStep {
    
    @scala.inline
    def apply(animator: IAnimator, attrToAppliedProjector: AttributeToAppliedProjector): AppliedDrawStep = {
      val __obj = js.Dynamic.literal(animator = animator.asInstanceOf[js.Any], attrToAppliedProjector = attrToAppliedProjector.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppliedDrawStep]
    }
    
    @scala.inline
    implicit class AppliedDrawStepMutableBuilder[Self <: AppliedDrawStep] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimator(value: IAnimator): Self = StObject.set(x, "animator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttrToAppliedProjector(value: AttributeToAppliedProjector): Self = StObject.set(x, "attrToAppliedProjector", value.asInstanceOf[js.Any])
    }
  }
  
  trait DrawStep extends StObject {
    
    var animator: IAnimator
    
    var attrToProjector: AttributeToProjector
  }
  object DrawStep {
    
    @scala.inline
    def apply(animator: IAnimator, attrToProjector: AttributeToProjector): DrawStep = {
      val __obj = js.Dynamic.literal(animator = animator.asInstanceOf[js.Any], attrToProjector = attrToProjector.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawStep]
    }
    
    @scala.inline
    implicit class DrawStepMutableBuilder[Self <: DrawStep] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimator(value: IAnimator): Self = StObject.set(x, "animator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttrToProjector(value: AttributeToProjector): Self = StObject.set(x, "attrToProjector", value.asInstanceOf[js.Any])
    }
  }
}
