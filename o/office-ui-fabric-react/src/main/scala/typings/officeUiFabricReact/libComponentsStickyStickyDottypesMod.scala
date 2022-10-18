package typings.officeUiFabricReact

import typings.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsStickyStickyDottypesMod {
  
  @js.native
  sealed trait StickyPositionType extends StObject
  @JSImport("office-ui-fabric-react/lib/components/Sticky/Sticky.types", "StickyPositionType")
  @js.native
  object StickyPositionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[StickyPositionType & Double] = js.native
    
    @js.native
    sealed trait Both
      extends StObject
         with StickyPositionType
    /* 0 */ val Both: typings.officeUiFabricReact.libComponentsStickyStickyDottypesMod.StickyPositionType.Both & Double = js.native
    
    @js.native
    sealed trait Footer
      extends StObject
         with StickyPositionType
    /* 2 */ val Footer: typings.officeUiFabricReact.libComponentsStickyStickyDottypesMod.StickyPositionType.Footer & Double = js.native
    
    @js.native
    sealed trait Header
      extends StObject
         with StickyPositionType
    /* 1 */ val Header: typings.officeUiFabricReact.libComponentsStickyStickyDottypesMod.StickyPositionType.Header & Double = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.Props<Sticky> * / any */ trait IStickyProps extends StObject {
    
    /**
      * Gets ref to component interface.
      */
    var componentRef: js.UndefOr[IRefObject[IStickyProps]] = js.undefined
    
    /**
      * If true, then match scrolling position of placeholder element in Sticky.
      * @defaultvalue true
      */
    var isScrollSynced: js.UndefOr[Boolean] = js.undefined
    
    /**
      * color to apply as 'background-color' style for sticky element.
      */
    var stickyBackgroundColor: js.UndefOr[String] = js.undefined
    
    /**
      * Class name to apply to the sticky element if component is sticky.
      */
    var stickyClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Region to render sticky component in.
      * @defaultvalue Both
      */
    var stickyPosition: js.UndefOr[StickyPositionType] = js.undefined
  }
  object IStickyProps {
    
    inline def apply(): IStickyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStickyProps]
    }
    
    extension [Self <: IStickyProps](x: Self) {
      
      inline def setComponentRef(value: IRefObject[IStickyProps]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ IStickyProps | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setIsScrollSynced(value: Boolean): Self = StObject.set(x, "isScrollSynced", value.asInstanceOf[js.Any])
      
      inline def setIsScrollSyncedUndefined: Self = StObject.set(x, "isScrollSynced", js.undefined)
      
      inline def setStickyBackgroundColor(value: String): Self = StObject.set(x, "stickyBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setStickyBackgroundColorUndefined: Self = StObject.set(x, "stickyBackgroundColor", js.undefined)
      
      inline def setStickyClassName(value: String): Self = StObject.set(x, "stickyClassName", value.asInstanceOf[js.Any])
      
      inline def setStickyClassNameUndefined: Self = StObject.set(x, "stickyClassName", js.undefined)
      
      inline def setStickyPosition(value: StickyPositionType): Self = StObject.set(x, "stickyPosition", value.asInstanceOf[js.Any])
      
      inline def setStickyPositionUndefined: Self = StObject.set(x, "stickyPosition", js.undefined)
    }
  }
}
