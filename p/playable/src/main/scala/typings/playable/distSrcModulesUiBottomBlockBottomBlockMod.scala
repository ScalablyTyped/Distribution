package typings.playable

import org.scalablytyped.runtime.Instantiable1
import typings.playable.distSrcModulesEventEmitterTypesMod.IEventEmitter
import typings.playable.distSrcModulesUiBottomBlockTypesMod.IBottomBlock
import typings.playable.distSrcModulesUiBottomBlockTypesMod.IBottomBlockViewConfig
import typings.playable.distSrcModulesUiControlsChromecastTypesMod.IChromecastButton
import typings.playable.distSrcModulesUiControlsDownloadTypesMod.IDownloadButton
import typings.playable.distSrcModulesUiControlsFullScreenTypesMod.IFullScreenControl
import typings.playable.distSrcModulesUiControlsLogoTypesMod.ILogoControl
import typings.playable.distSrcModulesUiControlsPictureInPictureTypesMod.IPictureInPictureControl
import typings.playable.distSrcModulesUiControlsPlayTypesMod.IPlayControl
import typings.playable.distSrcModulesUiControlsProgressTypesMod.IProgressControl
import typings.playable.distSrcModulesUiControlsTimeTypesMod.ITimeControl
import typings.playable.distSrcModulesUiControlsVolumeTypesMod.IVolumeControl
import typings.playable.playableStrings.left
import typings.playable.playableStrings.right
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiBottomBlockBottomBlockMod {
  
  @JSImport("playable/dist/src/modules/ui/bottom-block/bottom-block", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with BottomBlock {
    def this(dependencies: IDependencies) = this()
  }
  object default {
    
    @JSImport("playable/dist/src/modules/ui/bottom-block/bottom-block", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("playable/dist/src/modules/ui/bottom-block/bottom-block", "default.View")
    @js.native
    open class View protected ()
      extends typings.playable.distSrcModulesUiBottomBlockBottomBlockDotviewMod.default {
      def this(config: IBottomBlockViewConfig) = this()
    }
    /* static member */
    /* was `typeof View` */
    @JSImport("playable/dist/src/modules/ui/bottom-block/bottom-block", "default.View")
    @js.native
    def View: Instantiable1[
        /* config */ IBottomBlockViewConfig, 
        typings.playable.distSrcModulesUiBottomBlockBottomBlockDotviewMod.default
      ] = js.native
    inline def View_=(
      x: Instantiable1[
          /* config */ IBottomBlockViewConfig, 
          typings.playable.distSrcModulesUiBottomBlockBottomBlockDotviewMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/bottom-block/bottom-block", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    inline def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/bottom-block/bottom-block", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    inline def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait BottomBlock
    extends StObject
       with IBottomBlock {
    
    /* private */ var _bindEvents: Any = js.native
    
    /* private */ var _bindViewCallbacks: Any = js.native
    
    /* private */ var _eventEmitter: Any = js.native
    
    /* private */ var _getControlElements: Any = js.native
    
    /* private */ var _initUI: Any = js.native
    
    /* private */ var _isBlockFocused: Any = js.native
    
    /* private */ var _removeFocusState: Any = js.native
    
    /* private */ var _setFocusState: Any = js.native
    
    /* private */ var _unbindEvents: Any = js.native
    
    def addControl(key: String, element: HTMLElement, options: IAddControllOptions): Unit = js.native
    
    /**
      * Method for hiding picture-in-picture control.
      * @example
      * player.hidePictureInPictureControl();
      */
    def hidePictureInPictureControl(): Unit = js.native
    
    @JSName("isFocused")
    def isFocused_MBottomBlock: Boolean = js.native
    
    var isHidden: Boolean = js.native
    
    /**
      * Method for showing picture-in-picture control.
      * @example
      * player.showPictureInPictureControl();
      */
    def showPictureInPictureControl(): Unit = js.native
    
    var view: typings.playable.distSrcModulesUiBottomBlockBottomBlockDotviewMod.default = js.native
  }
  
  trait IAddControllOptions extends StObject {
    
    var position: js.UndefOr[left | right] = js.undefined
  }
  object IAddControllOptions {
    
    inline def apply(): IAddControllOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAddControllOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IAddControllOptions] (val x: Self) extends AnyVal {
      
      inline def setPosition(value: left | right): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
  
  trait IDependencies extends StObject {
    
    var chromecastButton: IChromecastButton
    
    var downloadButton: IDownloadButton
    
    var eventEmitter: IEventEmitter
    
    var fullScreenControl: IFullScreenControl
    
    var logo: ILogoControl
    
    var pictureInPictureControl: IPictureInPictureControl
    
    var playControl: IPlayControl
    
    var progressControl: IProgressControl
    
    var timeControl: ITimeControl
    
    var volumeControl: IVolumeControl
  }
  object IDependencies {
    
    inline def apply(
      chromecastButton: IChromecastButton,
      downloadButton: IDownloadButton,
      eventEmitter: IEventEmitter,
      fullScreenControl: IFullScreenControl,
      logo: ILogoControl,
      pictureInPictureControl: IPictureInPictureControl,
      playControl: IPlayControl,
      progressControl: IProgressControl,
      timeControl: ITimeControl,
      volumeControl: IVolumeControl
    ): IDependencies = {
      val __obj = js.Dynamic.literal(chromecastButton = chromecastButton.asInstanceOf[js.Any], downloadButton = downloadButton.asInstanceOf[js.Any], eventEmitter = eventEmitter.asInstanceOf[js.Any], fullScreenControl = fullScreenControl.asInstanceOf[js.Any], logo = logo.asInstanceOf[js.Any], pictureInPictureControl = pictureInPictureControl.asInstanceOf[js.Any], playControl = playControl.asInstanceOf[js.Any], progressControl = progressControl.asInstanceOf[js.Any], timeControl = timeControl.asInstanceOf[js.Any], volumeControl = volumeControl.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDependencies]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDependencies] (val x: Self) extends AnyVal {
      
      inline def setChromecastButton(value: IChromecastButton): Self = StObject.set(x, "chromecastButton", value.asInstanceOf[js.Any])
      
      inline def setDownloadButton(value: IDownloadButton): Self = StObject.set(x, "downloadButton", value.asInstanceOf[js.Any])
      
      inline def setEventEmitter(value: IEventEmitter): Self = StObject.set(x, "eventEmitter", value.asInstanceOf[js.Any])
      
      inline def setFullScreenControl(value: IFullScreenControl): Self = StObject.set(x, "fullScreenControl", value.asInstanceOf[js.Any])
      
      inline def setLogo(value: ILogoControl): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
      
      inline def setPictureInPictureControl(value: IPictureInPictureControl): Self = StObject.set(x, "pictureInPictureControl", value.asInstanceOf[js.Any])
      
      inline def setPlayControl(value: IPlayControl): Self = StObject.set(x, "playControl", value.asInstanceOf[js.Any])
      
      inline def setProgressControl(value: IProgressControl): Self = StObject.set(x, "progressControl", value.asInstanceOf[js.Any])
      
      inline def setTimeControl(value: ITimeControl): Self = StObject.set(x, "timeControl", value.asInstanceOf[js.Any])
      
      inline def setVolumeControl(value: IVolumeControl): Self = StObject.set(x, "volumeControl", value.asInstanceOf[js.Any])
    }
  }
}
