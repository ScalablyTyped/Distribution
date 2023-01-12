package typings.playable

import org.scalablytyped.runtime.Instantiable1
import typings.playable.anon.LiveStateEngine
import typings.playable.distSrcModulesUiControlsProgressTypesMod.IProgressControl
import typings.playable.distSrcModulesUiControlsProgressTypesMod.IProgressViewConfig
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiControlsProgressProgressMod {
  
  @JSImport("playable/dist/src/modules/ui/controls/progress/progress", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ProgressControl {
    def this(param0: LiveStateEngine) = this()
    
    /* private */ /* CompleteClass */
    var _addTimeIndicator: Any = js.native
    
    /* private */ /* CompleteClass */
    var _bindCallbacks: Any = js.native
    
    /* private */ /* CompleteClass */
    var _bindEvents: Any = js.native
    
    /* private */ /* CompleteClass */
    var _changeCurrentTimeOfVideo: Any = js.native
    
    /* private */ /* CompleteClass */
    var _convertPlayedPercentToTime: Any = js.native
    
    /* private */ /* CompleteClass */
    var _desiredSeekPosition: Any = js.native
    
    /* private */ /* CompleteClass */
    var _destroyInterceptor: Any = js.native
    
    /* private */ /* CompleteClass */
    var _engine: Any = js.native
    
    /* private */ /* CompleteClass */
    var _eventEmitter: Any = js.native
    
    /* private */ /* CompleteClass */
    var _hidePreview: Any = js.native
    
    /* private */ /* CompleteClass */
    var _hideTooltip: Any = js.native
    
    /* private */ /* CompleteClass */
    var _initInterceptor: Any = js.native
    
    /* private */ /* CompleteClass */
    var _initTimeIndicators: Any = js.native
    
    /* private */ /* CompleteClass */
    var _initUI: Any = js.native
    
    /* private */ /* CompleteClass */
    var _interceptor: Any = js.native
    
    /* private */ /* CompleteClass */
    var _isUserDragging: Any = js.native
    
    /* private */ /* CompleteClass */
    var _liveStateEngine: Any = js.native
    
    /* private */ /* CompleteClass */
    var _onChangePlayedPercent: Any = js.native
    
    /* private */ /* CompleteClass */
    var _onSyncWithLiveMouseEnter: Any = js.native
    
    /* private */ /* CompleteClass */
    var _onSyncWithLiveMouseLeave: Any = js.native
    
    /* private */ /* CompleteClass */
    var _pauseVideoOnDragStart: Any = js.native
    
    /* private */ /* CompleteClass */
    var _playVideoOnDragEnd: Any = js.native
    
    /* private */ /* CompleteClass */
    var _previewFullSize: Any = js.native
    
    /* private */ /* CompleteClass */
    var _previewThumbnail: Any = js.native
    
    /* private */ /* CompleteClass */
    var _processLiveStateChange: Any = js.native
    
    /* private */ /* CompleteClass */
    var _processStateChange: Any = js.native
    
    /* private */ /* CompleteClass */
    var _reset: Any = js.native
    
    /* private */ /* CompleteClass */
    var _setBuffered: Any = js.native
    
    /* private */ /* CompleteClass */
    var _setPlayed: Any = js.native
    
    /* private */ /* CompleteClass */
    var _shouldHidePreviewOnUpdate: Any = js.native
    
    /* private */ /* CompleteClass */
    var _shouldPlayAfterDragEnd: Any = js.native
    
    /* private */ /* CompleteClass */
    var _showFullScreenPreview: Any = js.native
    
    /* private */ /* CompleteClass */
    var _showTooltipAndPreview: Any = js.native
    
    /* private */ /* CompleteClass */
    var _startIntervalUpdates: Any = js.native
    
    /* private */ /* CompleteClass */
    var _startProcessingUserDrag: Any = js.native
    
    /* private */ /* CompleteClass */
    var _stopIntervalUpdates: Any = js.native
    
    /* private */ /* CompleteClass */
    var _stopProcessingUserDrag: Any = js.native
    
    /* private */ /* CompleteClass */
    var _syncWithLive: Any = js.native
    
    /* private */ /* CompleteClass */
    var _textMap: Any = js.native
    
    /* private */ /* CompleteClass */
    var _theme: Any = js.native
    
    /* private */ /* CompleteClass */
    var _timeIndicatorsToAdd: Any = js.native
    
    /* private */ /* CompleteClass */
    var _tooltipService: Any = js.native
    
    /* private */ /* CompleteClass */
    var _unbindEvents: Any = js.native
    
    /* private */ /* CompleteClass */
    var _updateAllIndicators: Any = js.native
    
    /* private */ /* CompleteClass */
    var _updateBufferIndicator: Any = js.native
    
    /* private */ /* CompleteClass */
    var _updateControlInterval: Any = js.native
    
    /* private */ /* CompleteClass */
    var _updatePlayedIndicator: Any = js.native
    
    /* CompleteClass */
    override def addTimeIndicator(time: Double): Unit = js.native
    
    /* CompleteClass */
    override def addTimeIndicators(times: js.Array[Double]): Unit = js.native
    
    /* CompleteClass */
    override def clearTimeIndicators(): Unit = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def getElement(): HTMLElement = js.native
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    var isHidden: Boolean = js.native
    
    /* CompleteClass */
    override def seekOnProgressDrag(): Unit = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
    
    /* CompleteClass */
    override def showPreviewOnProgressDrag(): Unit = js.native
    
    /* CompleteClass */
    var view: typings.playable.distSrcModulesUiControlsProgressProgressDotviewMod.default = js.native
  }
  object default {
    
    @JSImport("playable/dist/src/modules/ui/controls/progress/progress", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("playable/dist/src/modules/ui/controls/progress/progress", "default.View")
    @js.native
    open class View protected ()
      extends typings.playable.distSrcModulesUiControlsProgressProgressDotviewMod.default {
      def this(config: IProgressViewConfig) = this()
    }
    /* static member */
    /* was `typeof View` */
    @JSImport("playable/dist/src/modules/ui/controls/progress/progress", "default.View")
    @js.native
    def View: Instantiable1[
        /* config */ IProgressViewConfig, 
        typings.playable.distSrcModulesUiControlsProgressProgressDotviewMod.default
      ] = js.native
    inline def View_=(
      x: Instantiable1[
          /* config */ IProgressViewConfig, 
          typings.playable.distSrcModulesUiControlsProgressProgressDotviewMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/controls/progress/progress", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    inline def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/controls/progress/progress", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    inline def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("playable/dist/src/modules/ui/controls/progress/progress", "UPDATE_PROGRESS_INTERVAL_DELAY")
  @js.native
  val UPDATE_PROGRESS_INTERVAL_DELAY: Double = js.native
  
  trait ProgressControl
    extends StObject
       with IProgressControl {
    
    /* private */ var _addTimeIndicator: Any
    
    /* private */ var _bindCallbacks: Any
    
    /* private */ var _bindEvents: Any
    
    /* private */ var _changeCurrentTimeOfVideo: Any
    
    /* private */ var _convertPlayedPercentToTime: Any
    
    /* private */ var _desiredSeekPosition: Any
    
    /* private */ var _destroyInterceptor: Any
    
    /* private */ var _engine: Any
    
    /* private */ var _eventEmitter: Any
    
    /* private */ var _hidePreview: Any
    
    /* private */ var _hideTooltip: Any
    
    /* private */ var _initInterceptor: Any
    
    /* private */ var _initTimeIndicators: Any
    
    /* private */ var _initUI: Any
    
    /* private */ var _interceptor: Any
    
    /* private */ var _isUserDragging: Any
    
    /* private */ var _liveStateEngine: Any
    
    /* private */ var _onChangePlayedPercent: Any
    
    /* private */ var _onSyncWithLiveMouseEnter: Any
    
    /* private */ var _onSyncWithLiveMouseLeave: Any
    
    /* private */ var _pauseVideoOnDragStart: Any
    
    /* private */ var _playVideoOnDragEnd: Any
    
    /* private */ var _previewFullSize: Any
    
    /* private */ var _previewThumbnail: Any
    
    /* private */ var _processLiveStateChange: Any
    
    /* private */ var _processStateChange: Any
    
    /* private */ var _reset: Any
    
    /* private */ var _setBuffered: Any
    
    /* private */ var _setPlayed: Any
    
    /* private */ var _shouldHidePreviewOnUpdate: Any
    
    /* private */ var _shouldPlayAfterDragEnd: Any
    
    /* private */ var _showFullScreenPreview: Any
    
    /* private */ var _showTooltipAndPreview: Any
    
    /* private */ var _startIntervalUpdates: Any
    
    /* private */ var _startProcessingUserDrag: Any
    
    /* private */ var _stopIntervalUpdates: Any
    
    /* private */ var _stopProcessingUserDrag: Any
    
    /* private */ var _syncWithLive: Any
    
    /* private */ var _textMap: Any
    
    /* private */ var _theme: Any
    
    /* private */ var _timeIndicatorsToAdd: Any
    
    /* private */ var _tooltipService: Any
    
    /* private */ var _unbindEvents: Any
    
    /* private */ var _updateAllIndicators: Any
    
    /* private */ var _updateBufferIndicator: Any
    
    /* private */ var _updateControlInterval: Any
    
    /* private */ var _updatePlayedIndicator: Any
    
    var isHidden: Boolean
    
    var view: typings.playable.distSrcModulesUiControlsProgressProgressDotviewMod.default
  }
  object ProgressControl {
    
    inline def apply(
      _addTimeIndicator: Any,
      _bindCallbacks: Any,
      _bindEvents: Any,
      _changeCurrentTimeOfVideo: Any,
      _convertPlayedPercentToTime: Any,
      _desiredSeekPosition: Any,
      _destroyInterceptor: Any,
      _engine: Any,
      _eventEmitter: Any,
      _hidePreview: Any,
      _hideTooltip: Any,
      _initInterceptor: Any,
      _initTimeIndicators: Any,
      _initUI: Any,
      _interceptor: Any,
      _isUserDragging: Any,
      _liveStateEngine: Any,
      _onChangePlayedPercent: Any,
      _onSyncWithLiveMouseEnter: Any,
      _onSyncWithLiveMouseLeave: Any,
      _pauseVideoOnDragStart: Any,
      _playVideoOnDragEnd: Any,
      _previewFullSize: Any,
      _previewThumbnail: Any,
      _processLiveStateChange: Any,
      _processStateChange: Any,
      _reset: Any,
      _setBuffered: Any,
      _setPlayed: Any,
      _shouldHidePreviewOnUpdate: Any,
      _shouldPlayAfterDragEnd: Any,
      _showFullScreenPreview: Any,
      _showTooltipAndPreview: Any,
      _startIntervalUpdates: Any,
      _startProcessingUserDrag: Any,
      _stopIntervalUpdates: Any,
      _stopProcessingUserDrag: Any,
      _syncWithLive: Any,
      _textMap: Any,
      _theme: Any,
      _timeIndicatorsToAdd: Any,
      _tooltipService: Any,
      _unbindEvents: Any,
      _updateAllIndicators: Any,
      _updateBufferIndicator: Any,
      _updateControlInterval: Any,
      _updatePlayedIndicator: Any,
      addTimeIndicator: Double => Unit,
      addTimeIndicators: js.Array[Double] => Unit,
      clearTimeIndicators: () => Unit,
      destroy: () => Unit,
      getElement: () => HTMLElement,
      hide: () => Unit,
      isHidden: Boolean,
      seekOnProgressDrag: () => Unit,
      show: () => Unit,
      showPreviewOnProgressDrag: () => Unit,
      view: typings.playable.distSrcModulesUiControlsProgressProgressDotviewMod.default
    ): ProgressControl = {
      val __obj = js.Dynamic.literal(_addTimeIndicator = _addTimeIndicator.asInstanceOf[js.Any], _bindCallbacks = _bindCallbacks.asInstanceOf[js.Any], _bindEvents = _bindEvents.asInstanceOf[js.Any], _changeCurrentTimeOfVideo = _changeCurrentTimeOfVideo.asInstanceOf[js.Any], _convertPlayedPercentToTime = _convertPlayedPercentToTime.asInstanceOf[js.Any], _desiredSeekPosition = _desiredSeekPosition.asInstanceOf[js.Any], _destroyInterceptor = _destroyInterceptor.asInstanceOf[js.Any], _engine = _engine.asInstanceOf[js.Any], _eventEmitter = _eventEmitter.asInstanceOf[js.Any], _hidePreview = _hidePreview.asInstanceOf[js.Any], _hideTooltip = _hideTooltip.asInstanceOf[js.Any], _initInterceptor = _initInterceptor.asInstanceOf[js.Any], _initTimeIndicators = _initTimeIndicators.asInstanceOf[js.Any], _initUI = _initUI.asInstanceOf[js.Any], _interceptor = _interceptor.asInstanceOf[js.Any], _isUserDragging = _isUserDragging.asInstanceOf[js.Any], _liveStateEngine = _liveStateEngine.asInstanceOf[js.Any], _onChangePlayedPercent = _onChangePlayedPercent.asInstanceOf[js.Any], _onSyncWithLiveMouseEnter = _onSyncWithLiveMouseEnter.asInstanceOf[js.Any], _onSyncWithLiveMouseLeave = _onSyncWithLiveMouseLeave.asInstanceOf[js.Any], _pauseVideoOnDragStart = _pauseVideoOnDragStart.asInstanceOf[js.Any], _playVideoOnDragEnd = _playVideoOnDragEnd.asInstanceOf[js.Any], _previewFullSize = _previewFullSize.asInstanceOf[js.Any], _previewThumbnail = _previewThumbnail.asInstanceOf[js.Any], _processLiveStateChange = _processLiveStateChange.asInstanceOf[js.Any], _processStateChange = _processStateChange.asInstanceOf[js.Any], _reset = _reset.asInstanceOf[js.Any], _setBuffered = _setBuffered.asInstanceOf[js.Any], _setPlayed = _setPlayed.asInstanceOf[js.Any], _shouldHidePreviewOnUpdate = _shouldHidePreviewOnUpdate.asInstanceOf[js.Any], _shouldPlayAfterDragEnd = _shouldPlayAfterDragEnd.asInstanceOf[js.Any], _showFullScreenPreview = _showFullScreenPreview.asInstanceOf[js.Any], _showTooltipAndPreview = _showTooltipAndPreview.asInstanceOf[js.Any], _startIntervalUpdates = _startIntervalUpdates.asInstanceOf[js.Any], _startProcessingUserDrag = _startProcessingUserDrag.asInstanceOf[js.Any], _stopIntervalUpdates = _stopIntervalUpdates.asInstanceOf[js.Any], _stopProcessingUserDrag = _stopProcessingUserDrag.asInstanceOf[js.Any], _syncWithLive = _syncWithLive.asInstanceOf[js.Any], _textMap = _textMap.asInstanceOf[js.Any], _theme = _theme.asInstanceOf[js.Any], _timeIndicatorsToAdd = _timeIndicatorsToAdd.asInstanceOf[js.Any], _tooltipService = _tooltipService.asInstanceOf[js.Any], _unbindEvents = _unbindEvents.asInstanceOf[js.Any], _updateAllIndicators = _updateAllIndicators.asInstanceOf[js.Any], _updateBufferIndicator = _updateBufferIndicator.asInstanceOf[js.Any], _updateControlInterval = _updateControlInterval.asInstanceOf[js.Any], _updatePlayedIndicator = _updatePlayedIndicator.asInstanceOf[js.Any], addTimeIndicator = js.Any.fromFunction1(addTimeIndicator), addTimeIndicators = js.Any.fromFunction1(addTimeIndicators), clearTimeIndicators = js.Any.fromFunction0(clearTimeIndicators), destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), isHidden = isHidden.asInstanceOf[js.Any], seekOnProgressDrag = js.Any.fromFunction0(seekOnProgressDrag), show = js.Any.fromFunction0(show), showPreviewOnProgressDrag = js.Any.fromFunction0(showPreviewOnProgressDrag), view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProgressControl]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProgressControl] (val x: Self) extends AnyVal {
      
      inline def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      inline def setView(value: typings.playable.distSrcModulesUiControlsProgressProgressDotviewMod.default): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def set_addTimeIndicator(value: Any): Self = StObject.set(x, "_addTimeIndicator", value.asInstanceOf[js.Any])
      
      inline def set_bindCallbacks(value: Any): Self = StObject.set(x, "_bindCallbacks", value.asInstanceOf[js.Any])
      
      inline def set_bindEvents(value: Any): Self = StObject.set(x, "_bindEvents", value.asInstanceOf[js.Any])
      
      inline def set_changeCurrentTimeOfVideo(value: Any): Self = StObject.set(x, "_changeCurrentTimeOfVideo", value.asInstanceOf[js.Any])
      
      inline def set_convertPlayedPercentToTime(value: Any): Self = StObject.set(x, "_convertPlayedPercentToTime", value.asInstanceOf[js.Any])
      
      inline def set_desiredSeekPosition(value: Any): Self = StObject.set(x, "_desiredSeekPosition", value.asInstanceOf[js.Any])
      
      inline def set_destroyInterceptor(value: Any): Self = StObject.set(x, "_destroyInterceptor", value.asInstanceOf[js.Any])
      
      inline def set_engine(value: Any): Self = StObject.set(x, "_engine", value.asInstanceOf[js.Any])
      
      inline def set_eventEmitter(value: Any): Self = StObject.set(x, "_eventEmitter", value.asInstanceOf[js.Any])
      
      inline def set_hidePreview(value: Any): Self = StObject.set(x, "_hidePreview", value.asInstanceOf[js.Any])
      
      inline def set_hideTooltip(value: Any): Self = StObject.set(x, "_hideTooltip", value.asInstanceOf[js.Any])
      
      inline def set_initInterceptor(value: Any): Self = StObject.set(x, "_initInterceptor", value.asInstanceOf[js.Any])
      
      inline def set_initTimeIndicators(value: Any): Self = StObject.set(x, "_initTimeIndicators", value.asInstanceOf[js.Any])
      
      inline def set_initUI(value: Any): Self = StObject.set(x, "_initUI", value.asInstanceOf[js.Any])
      
      inline def set_interceptor(value: Any): Self = StObject.set(x, "_interceptor", value.asInstanceOf[js.Any])
      
      inline def set_isUserDragging(value: Any): Self = StObject.set(x, "_isUserDragging", value.asInstanceOf[js.Any])
      
      inline def set_liveStateEngine(value: Any): Self = StObject.set(x, "_liveStateEngine", value.asInstanceOf[js.Any])
      
      inline def set_onChangePlayedPercent(value: Any): Self = StObject.set(x, "_onChangePlayedPercent", value.asInstanceOf[js.Any])
      
      inline def set_onSyncWithLiveMouseEnter(value: Any): Self = StObject.set(x, "_onSyncWithLiveMouseEnter", value.asInstanceOf[js.Any])
      
      inline def set_onSyncWithLiveMouseLeave(value: Any): Self = StObject.set(x, "_onSyncWithLiveMouseLeave", value.asInstanceOf[js.Any])
      
      inline def set_pauseVideoOnDragStart(value: Any): Self = StObject.set(x, "_pauseVideoOnDragStart", value.asInstanceOf[js.Any])
      
      inline def set_playVideoOnDragEnd(value: Any): Self = StObject.set(x, "_playVideoOnDragEnd", value.asInstanceOf[js.Any])
      
      inline def set_previewFullSize(value: Any): Self = StObject.set(x, "_previewFullSize", value.asInstanceOf[js.Any])
      
      inline def set_previewThumbnail(value: Any): Self = StObject.set(x, "_previewThumbnail", value.asInstanceOf[js.Any])
      
      inline def set_processLiveStateChange(value: Any): Self = StObject.set(x, "_processLiveStateChange", value.asInstanceOf[js.Any])
      
      inline def set_processStateChange(value: Any): Self = StObject.set(x, "_processStateChange", value.asInstanceOf[js.Any])
      
      inline def set_reset(value: Any): Self = StObject.set(x, "_reset", value.asInstanceOf[js.Any])
      
      inline def set_setBuffered(value: Any): Self = StObject.set(x, "_setBuffered", value.asInstanceOf[js.Any])
      
      inline def set_setPlayed(value: Any): Self = StObject.set(x, "_setPlayed", value.asInstanceOf[js.Any])
      
      inline def set_shouldHidePreviewOnUpdate(value: Any): Self = StObject.set(x, "_shouldHidePreviewOnUpdate", value.asInstanceOf[js.Any])
      
      inline def set_shouldPlayAfterDragEnd(value: Any): Self = StObject.set(x, "_shouldPlayAfterDragEnd", value.asInstanceOf[js.Any])
      
      inline def set_showFullScreenPreview(value: Any): Self = StObject.set(x, "_showFullScreenPreview", value.asInstanceOf[js.Any])
      
      inline def set_showTooltipAndPreview(value: Any): Self = StObject.set(x, "_showTooltipAndPreview", value.asInstanceOf[js.Any])
      
      inline def set_startIntervalUpdates(value: Any): Self = StObject.set(x, "_startIntervalUpdates", value.asInstanceOf[js.Any])
      
      inline def set_startProcessingUserDrag(value: Any): Self = StObject.set(x, "_startProcessingUserDrag", value.asInstanceOf[js.Any])
      
      inline def set_stopIntervalUpdates(value: Any): Self = StObject.set(x, "_stopIntervalUpdates", value.asInstanceOf[js.Any])
      
      inline def set_stopProcessingUserDrag(value: Any): Self = StObject.set(x, "_stopProcessingUserDrag", value.asInstanceOf[js.Any])
      
      inline def set_syncWithLive(value: Any): Self = StObject.set(x, "_syncWithLive", value.asInstanceOf[js.Any])
      
      inline def set_textMap(value: Any): Self = StObject.set(x, "_textMap", value.asInstanceOf[js.Any])
      
      inline def set_theme(value: Any): Self = StObject.set(x, "_theme", value.asInstanceOf[js.Any])
      
      inline def set_timeIndicatorsToAdd(value: Any): Self = StObject.set(x, "_timeIndicatorsToAdd", value.asInstanceOf[js.Any])
      
      inline def set_tooltipService(value: Any): Self = StObject.set(x, "_tooltipService", value.asInstanceOf[js.Any])
      
      inline def set_unbindEvents(value: Any): Self = StObject.set(x, "_unbindEvents", value.asInstanceOf[js.Any])
      
      inline def set_updateAllIndicators(value: Any): Self = StObject.set(x, "_updateAllIndicators", value.asInstanceOf[js.Any])
      
      inline def set_updateBufferIndicator(value: Any): Self = StObject.set(x, "_updateBufferIndicator", value.asInstanceOf[js.Any])
      
      inline def set_updateControlInterval(value: Any): Self = StObject.set(x, "_updateControlInterval", value.asInstanceOf[js.Any])
      
      inline def set_updatePlayedIndicator(value: Any): Self = StObject.set(x, "_updatePlayedIndicator", value.asInstanceOf[js.Any])
    }
  }
}
