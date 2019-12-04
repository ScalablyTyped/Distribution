package typings.p5.p5Mod

import typings.std.Blob
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SoundFile extends js.Object {
  /**
    *   Schedule events to trigger every time a
    *   MediaElement (audio/video) reaches a playback cue
    *   point. Accepts a callback function, a time (in
    *   seconds) at which to trigger the callback, and an
    *   optional parameter for the callback.
    *
    *   Time will be passed as the first parameter to the
    *   callback function, and param will be the second
    *   parameter.
    *   @param time Time in seconds, relative to this
    *   media element's playback. For example, to trigger
    *   an event every time playback reaches two seconds,
    *   pass in the number 2. This will be passed as the
    *   first parameter to the callback function.
    *   @param callback Name of a function that will be
    *   called at the given time. The callback will
    *   receive time and (optionally) param as its two
    *   parameters.
    *   @param [value] An object to be passed as the
    *   second parameter to the callback function.
    *   @return id ID of this cue, useful for
    *   removeCue(id)
    */
  def addCue(time: Double, callback: js.Function1[/* repeated */ js.Any, _]): Double = js.native
  def addCue(time: Double, callback: js.Function1[/* repeated */ js.Any, _], value: js.Object): Double = js.native
  /**
    *   Return the number of channels in a sound file. For
    *   example, Mono = 1, Stereo = 2.
    *   @return [channels]
    */
  def channels(): Double = js.native
  /**
    *   Remove all of the callbacks that had originally
    *   been scheduled via the addCue method.
    */
  def clearCues(): Unit = js.native
  /**
    *   Connects the output of a p5sound object to input
    *   of another p5.sound object. For example, you may
    *   connect a p5.SoundFile to an FFT or an Effect. If
    *   no parameter is given, it will connect to the
    *   master output. Most p5sound objects connect to the
    *   master output when they are created.
    *   @param [object] Audio object that accepts an input
    */
  def connect(): Unit = js.native
  def connect(`object`: js.Object): Unit = js.native
  /**
    *   Return the current position of the p5.SoundFile
    *   playhead, in seconds. Time is relative to the
    *   normal buffer direction, so if reverseBuffer has
    *   been called, currentTime will count backwards.
    *   @return currentTime of the soundFile in seconds.
    */
  def currentTime(): Double = js.native
  /**
    *   Disconnects the output of this p5sound object.
    */
  def disconnect(): Unit = js.native
  /**
    *   Returns the duration of a sound file in seconds.
    *   @return The duration of the soundFile in seconds.
    */
  def duration(): Double = js.native
  /**
    *   Return the number of samples in a sound file.
    *   Equal to sampleRate * duration.
    *   @return [sampleCount]
    */
  def frames(): Double = js.native
  /**
    *   This method is useful for sending a SoundFile to a
    *   server. It returns the .wav-encoded audio data as
    *   a "Blob". A Blob is a file-like data object that
    *   can be uploaded to a server with an http request.
    *   We'll use the httpDo options object to send a POST
    *   request with some specific options: we encode the
    *   request as multipart/form-data, and attach the
    *   blob as one of the form values using FormData.
    *   @return A file-like data object
    */
  def getBlob(): Blob = js.native
  /**
    *   Returns the current stereo pan position (-1.0 to
    *   1.0)
    *   @return Returns the stereo pan setting of the
    *   Oscillator as a number between -1.0 (left) and 1.0
    *   (right). 0.0 is center and default.
    */
  def getPan(): Double = js.native
  /**
    *   Returns an array of amplitude peaks in a
    *   p5.SoundFile that can be used to draw a static
    *   waveform. Scans through the p5.SoundFile's audio
    *   buffer to find the greatest amplitudes. Accepts
    *   one parameter, 'length', which determines size of
    *   the array. Larger arrays result in more precise
    *   waveform visualizations. Inspired by
    *   Wavesurfer.js.
    *   @param [length] length is the size of the returned
    *   array. Larger length results in more precision.
    *   Defaults to 5*width of the browser window.
    *   @return Array of peaks.
    */
  def getPeaks(): Float32Array = js.native
  def getPeaks(length: Double): Float32Array = js.native
  /**
    *   Returns true if the sound file finished loading
    *   successfully.
    */
  def isLoaded(): Boolean = js.native
  /**
    *   Returns 'true' if a p5.SoundFile is currently
    *   looping and playing, 'false' if not.
    */
  def isLooping(): Boolean = js.native
  /**
    *   Returns true if a p5.SoundFile is paused, false if
    *   not (i.e. playing or stopped).
    */
  def isPaused(): Boolean = js.native
  /**
    *   Returns true if a p5.SoundFile is playing, false
    *   if not (i.e. paused or stopped).
    */
  def isPlaying(): Boolean = js.native
  /**
    *   Move the playhead of the song to a position, in
    *   seconds. Start timing and playback duration. If
    *   none are given, will reset the file to play entire
    *   duration from start to finish.
    *   @param cueTime cueTime of the soundFile in
    *   seconds.
    *   @param duration duration in seconds.
    */
  def jump(cueTime: Double, duration: Double): Unit = js.native
  /**
    *   loadSound() returns a new p5.SoundFile from a
    *   specified path. If called during preload(), the
    *   p5.SoundFile will be ready to play in time for
    *   setup() and draw(). If called outside of preload,
    *   the p5.SoundFile will not be ready immediately, so
    *   loadSound accepts a callback as the second
    *   parameter. Using a  local server is recommended
    *   when loading external files.
    *   @param path Path to the sound file, or an array
    *   with paths to soundfiles in multiple formats i.e.
    *   ['sound.ogg', 'sound.mp3']. Alternately, accepts
    *   an object: either from the HTML5 File API, or a
    *   p5.File.
    *   @param [successCallback] Name of a function to
    *   call once file loads
    *   @param [errorCallback] Name of a function to call
    *   if there is an error loading the file.
    *   @param [whileLoading] Name of a function to call
    *   while file is loading. This function will receive
    *   the percentage loaded so far, from 0.0 to 1.0.
    *   @return Returns a p5.SoundFile
    */
  def loadSound(path: String): SoundFile = js.native
  def loadSound(path: String, successCallback: js.Function1[/* repeated */ js.Any, _]): SoundFile = js.native
  def loadSound(
    path: String,
    successCallback: js.Function1[/* repeated */ js.Any, _],
    errorCallback: js.Function1[/* repeated */ js.Any, _]
  ): SoundFile = js.native
  def loadSound(
    path: String,
    successCallback: js.Function1[/* repeated */ js.Any, _],
    errorCallback: js.Function1[/* repeated */ js.Any, _],
    whileLoading: js.Function1[/* repeated */ js.Any, _]
  ): SoundFile = js.native
  def loadSound(path: js.Array[_]): SoundFile = js.native
  def loadSound(path: js.Array[_], successCallback: js.Function1[/* repeated */ js.Any, _]): SoundFile = js.native
  def loadSound(
    path: js.Array[_],
    successCallback: js.Function1[/* repeated */ js.Any, _],
    errorCallback: js.Function1[/* repeated */ js.Any, _]
  ): SoundFile = js.native
  def loadSound(
    path: js.Array[_],
    successCallback: js.Function1[/* repeated */ js.Any, _],
    errorCallback: js.Function1[/* repeated */ js.Any, _],
    whileLoading: js.Function1[/* repeated */ js.Any, _]
  ): SoundFile = js.native
  /**
    *   Loop the p5.SoundFile. Accepts optional parameters
    *   to set the playback rate, playback volume,
    *   loopStart, loopEnd.
    *   @param [startTime] (optional) schedule event to
    *   occur seconds from now
    *   @param [rate] (optional) playback rate
    *   @param [amp] (optional) playback volume
    *   @param [cueLoopStart] (optional) startTime in
    *   seconds
    *   @param [duration] (optional) loop duration in
    *   seconds
    */
  def loop(): Unit = js.native
  def loop(startTime: Double): Unit = js.native
  def loop(startTime: Double, rate: Double): Unit = js.native
  def loop(startTime: Double, rate: Double, amp: Double): Unit = js.native
  def loop(startTime: Double, rate: Double, amp: Double, cueLoopStart: Double): Unit = js.native
  def loop(startTime: Double, rate: Double, amp: Double, cueLoopStart: Double, duration: Double): Unit = js.native
  /**
    *   Schedule an event to be called when the soundfile
    *   reaches the end of a buffer. If the soundfile is
    *   playing through once, this will be called when it
    *   ends. If it is looping, it will be called when
    *   stop is called.
    *   @param callback function to call when the
    *   soundfile has ended.
    */
  def onended(callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  /**
    *   Set the stereo panning of a p5.sound object to a
    *   floating point number between -1.0 (left) and 1.0
    *   (right). Default is 0.0 (center).
    *   @param [panValue] Set the stereo panner
    *   @param [timeFromNow] schedule this event to happen
    *   seconds from now
    */
  def pan(): Unit = js.native
  def pan(panValue: Double): Unit = js.native
  def pan(panValue: Double, timeFromNow: Double): Unit = js.native
  /**
    *   Pauses a file that is currently playing. If the
    *   file is not playing, then nothing will happen.
    *   After pausing, .play() will resume from the paused
    *   position. If p5.SoundFile had been set to loop
    *   before it was paused, it will continue to loop
    *   after it is unpaused with .play().
    *   @param [startTime] (optional) schedule event to
    *   occur seconds from now
    */
  def pause(): Unit = js.native
  def pause(startTime: Double): Unit = js.native
  /**
    *   Play the p5.SoundFile
    *   @param [startTime] (optional) schedule playback to
    *   start (in seconds from now).
    *   @param [rate] (optional) playback rate
    *   @param [amp] (optional) amplitude (volume) of
    *   playback
    *   @param [cueStart] (optional) cue start time in
    *   seconds
    *   @param [duration] (optional) duration of playback
    *   in seconds
    */
  def play(): Unit = js.native
  def play(startTime: Double): Unit = js.native
  def play(startTime: Double, rate: Double): Unit = js.native
  def play(startTime: Double, rate: Double, amp: Double): Unit = js.native
  def play(startTime: Double, rate: Double, amp: Double, cueStart: Double): Unit = js.native
  def play(startTime: Double, rate: Double, amp: Double, cueStart: Double, duration: Double): Unit = js.native
  /**
    *   p5.SoundFile has two play modes: restart and
    *   sustain. Play Mode determines what happens to a
    *   p5.SoundFile if it is triggered while in the
    *   middle of playback. In sustain mode, playback will
    *   continue simultaneous to the new playback. In
    *   restart mode, play() will stop playback and start
    *   over. With untilDone, a sound will play only if
    *   it's not already playing. Sustain is the default
    *   mode.
    *   @param str 'restart' or 'sustain' or 'untilDone'
    */
  def playMode(str: String): Unit = js.native
  /**
    *   processPeaks returns an array of timestamps where
    *   it thinks there is a beat. This is an asynchronous
    *   function that processes the soundfile in an
    *   offline audio context, and sends the results to
    *   your callback function.
    *
    *   The process involves running the soundfile through
    *   a lowpass filter, and finding all of the peaks
    *   above the initial threshold. If the total number
    *   of peaks are below the minimum number of peaks, it
    *   decreases the threshold and re-runs the analysis
    *   until either minPeaks or minThreshold are reached.
    *   @param callback a function to call once this data
    *   is returned
    *   @param [initThreshold] initial threshold defaults
    *   to 0.9
    *   @param [minThreshold] minimum threshold defaults
    *   to 0.22
    *   @param [minPeaks] minimum number of peaks defaults
    *   to 200
    *   @return Array of timestamped peaks
    */
  def processPeaks(callback: js.Function1[/* repeated */ js.Any, _]): js.Array[_] = js.native
  def processPeaks(callback: js.Function1[/* repeated */ js.Any, _], initThreshold: Double): js.Array[_] = js.native
  def processPeaks(callback: js.Function1[/* repeated */ js.Any, _], initThreshold: Double, minThreshold: Double): js.Array[_] = js.native
  def processPeaks(
    callback: js.Function1[/* repeated */ js.Any, _],
    initThreshold: Double,
    minThreshold: Double,
    minPeaks: Double
  ): js.Array[_] = js.native
  /**
    *   Set the playback rate of a sound file. Will change
    *   the speed and the pitch. Values less than zero
    *   will reverse the audio buffer.
    *   @param [playbackRate] Set the playback rate. 1.0
    *   is normal, .5 is half-speed, 2.0 is twice as fast.
    *   Values less than zero play backwards.
    */
  def rate(): Unit = js.native
  def rate(playbackRate: Double): Unit = js.native
  /**
    *   Remove a callback based on its ID. The ID is
    *   returned by the addCue method.
    *   @param id ID of the cue, as returned by addCue
    */
  def removeCue(id: Double): Unit = js.native
  /**
    *   Reverses the p5.SoundFile's buffer source.
    *   Playback must be handled separately (see example).
    */
  def reverseBuffer(): Unit = js.native
  /**
    *   Return the sample rate of the sound file.
    *   @return [sampleRate]
    */
  def sampleRate(): Double = js.native
  /**
    *   Save a p5.SoundFile as a .wav file. The browser
    *   will prompt the user to download the file to their
    *   device. To upload a file to a server, see getBlob
    *   @param [fileName] name of the resulting .wav file.
    */
  def save(): Unit = js.native
  def save(fileName: String): Unit = js.native
  /**
    *   Replace the current Audio Buffer with a new
    *   Buffer.
    *   @param buf Array of Float32 Array(s). 2 Float32
    *   Arrays will create a stereo source. 1 will create
    *   a mono source.
    */
  def setBuffer(buf: js.Array[_]): Unit = js.native
  /**
    *   Set a p5.SoundFile's looping flag to true or
    *   false. If the sound is currently playing, this
    *   change will take effect when it reaches the end of
    *   the current playback.
    *   @param Boolean set looping to true or false
    */
  def setLoop(Boolean: Boolean): Unit = js.native
  /**
    *   Reset the source for this SoundFile to a new path
    *   (URL).
    *   @param path path to audio file
    *   @param callback Callback
    */
  def setPath(path: String, callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  def setVolume(volume: js.Object): Unit = js.native
  def setVolume(volume: js.Object, rampTime: Double): Unit = js.native
  def setVolume(volume: js.Object, rampTime: Double, timeFromNow: Double): Unit = js.native
  /**
    *   Multiply the output volume (amplitude) of a sound
    *   file between 0.0 (silence) and 1.0 (full volume).
    *   1.0 is the maximum amplitude of a digital sound,
    *   so multiplying by greater than 1.0 may cause
    *   digital distortion. To fade, provide a rampTime
    *   parameter. For more complex fades, see the
    *   Envelope class. Alternately, you can pass in a
    *   signal source such as an oscillator to modulate
    *   the amplitude with an audio signal.
    *   @param volume Volume (amplitude) between 0.0 and
    *   1.0 or modulating signal/oscillator
    *   @param [rampTime] Fade for t seconds
    *   @param [timeFromNow] Schedule this event to happen
    *   at t seconds in the future
    */
  def setVolume(volume: Double): Unit = js.native
  def setVolume(volume: Double, rampTime: Double): Unit = js.native
  def setVolume(volume: Double, rampTime: Double, timeFromNow: Double): Unit = js.native
  /**
    *   Stop soundfile playback.
    *   @param [startTime] (optional) schedule event to
    *   occur in seconds from now
    */
  def stop(): Unit = js.native
  def stop(startTime: Double): Unit = js.native
}

