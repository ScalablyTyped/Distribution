package typings.oojsUi.OO.ui

import typings.jquery.JQuery.Deferred.CallbackBase
import typings.jquery.JQuery.PromiseBase
import typings.jquery.JQuery.Thenable
import typings.jquery.JQuery.TypeOrArray
import typings.oojsUi.anon.Fn0
import typings.oojsUi.anon.FnCall
import typings.oojsUi.anon.FnCallDoneFilterFailFilterProgressFilter
import typings.oojsUi.anon.FnCallTarget
import typings.oojsUi.oojsUiStrings.pending
import typings.oojsUi.oojsUiStrings.rejected
import typings.oojsUi.oojsUiStrings.resolved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeprecatedPromise[TR, TJ, TN, UR, UJ, UN] extends StObject {
  
  /** @deprecated */
  def always(
    alwaysCallback: TypeOrArray[CallbackBase[TR | TJ, UR | UJ, scala.Nothing, scala.Nothing]],
    alwaysCallbacks: (TypeOrArray[CallbackBase[TR | TJ, UR | UJ, scala.Nothing, scala.Nothing]])*
  ): this.type
  /** @deprecated */
  @JSName("always")
  var always_Original: js.Function2[
    /* alwaysCallback */ TypeOrArray[CallbackBase[TR | TJ, UR | UJ, scala.Nothing, scala.Nothing]], 
    /* repeated */ TypeOrArray[CallbackBase[TR | TJ, UR | UJ, scala.Nothing, scala.Nothing]], 
    this.type
  ]
  
  /** @deprecated */
  def `catch`[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF](): PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF]
  /** @deprecated */
  def `catch`[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF](
    failFilter: js.Function4[
      /* t */ TJ, 
      /* u */ UJ, 
      /* v */ scala.Nothing, 
      /* repeated */ scala.Nothing, 
      (PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF]) | Thenable[ARF] | ARF
    ]
  ): PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF]
  /** @deprecated */
  @JSName("catch")
  var catch_Original: FnCall[TJ, UJ]
  
  /** @deprecated */
  def done(
    doneCallback: TypeOrArray[CallbackBase[TR, UR, scala.Nothing, scala.Nothing]],
    doneCallbacks: (TypeOrArray[CallbackBase[TR, UR, scala.Nothing, scala.Nothing]])*
  ): this.type
  /** @deprecated */
  @JSName("done")
  var done_Original: js.Function2[
    /* doneCallback */ TypeOrArray[CallbackBase[TR, UR, scala.Nothing, scala.Nothing]], 
    /* repeated */ TypeOrArray[CallbackBase[TR, UR, scala.Nothing, scala.Nothing]], 
    this.type
  ]
  
  /** @deprecated */
  def fail(
    failCallback: TypeOrArray[CallbackBase[TJ, UJ, scala.Nothing, scala.Nothing]],
    failCallbacks: (TypeOrArray[CallbackBase[TJ, UJ, scala.Nothing, scala.Nothing]])*
  ): this.type
  /** @deprecated */
  @JSName("fail")
  var fail_Original: js.Function2[
    /* failCallback */ TypeOrArray[CallbackBase[TJ, UJ, scala.Nothing, scala.Nothing]], 
    /* repeated */ TypeOrArray[CallbackBase[TJ, UJ, scala.Nothing, scala.Nothing]], 
    this.type
  ]
  
  /** @deprecated */
  def pipe[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP](): PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP]
  /** @deprecated */
  def pipe[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND](
    doneFilter: js.Function4[
      /* t */ TR, 
      /* u */ UR, 
      /* v */ scala.Nothing, 
      /* repeated */ scala.Nothing, 
      (PromiseBase[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND]) | Thenable[ARD] | ARD
    ]
  ): PromiseBase[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND]
  /** @deprecated */
  def pipe[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF](
    doneFilter: Null,
    failFilter: js.Function4[
      /* t */ TJ, 
      /* u */ UJ, 
      /* v */ scala.Nothing, 
      /* repeated */ scala.Nothing, 
      (PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF]) | Thenable[AJF] | AJF
    ]
  ): PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF]
  /** @deprecated */
  def pipe[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP](
    doneFilter: Null,
    failFilter: Null,
    progressFilter: js.Function4[
      /* t */ TN, 
      /* u */ UN, 
      /* v */ scala.Nothing, 
      /* repeated */ scala.Nothing, 
      (PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP]) | Thenable[ANP] | ANP
    ]
  ): PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP]
  /** @deprecated */
  def pipe[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND, ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF](
    doneFilter: js.Function4[
      /* t */ TR, 
      /* u */ UR, 
      /* v */ scala.Nothing, 
      /* repeated */ scala.Nothing, 
      (PromiseBase[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND]) | Thenable[ARD] | ARD
    ],
    failFilter: js.Function4[
      /* t */ TJ, 
      /* u */ UJ, 
      /* v */ scala.Nothing, 
      /* repeated */ scala.Nothing, 
      (PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF]) | Thenable[AJF] | AJF
    ]
  ): PromiseBase[
    ARD | ARF, 
    AJD | AJF, 
    AND | ANF, 
    BRD | BRF, 
    BJD | BJF, 
    BND | BNF, 
    CRD | CRF, 
    CJD | CJF, 
    CND | CNF, 
    RRD | RRF, 
    RJD | RJF, 
    RND | RNF
  ]
  /** @deprecated */
  def pipe[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND, ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP](
    doneFilter: js.Function4[
      /* t */ TR, 
      /* u */ UR, 
      /* v */ scala.Nothing, 
      /* repeated */ scala.Nothing, 
      (PromiseBase[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND]) | Thenable[ARD] | ARD
    ],
    failFilter: Null,
    progressFilter: js.Function4[
      /* t */ TN, 
      /* u */ UN, 
      /* v */ scala.Nothing, 
      /* repeated */ scala.Nothing, 
      (PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP]) | Thenable[ANP] | ANP
    ]
  ): PromiseBase[
    ARD | ARP, 
    AJD | AJP, 
    AND | ANP, 
    BRD | BRP, 
    BJD | BJP, 
    BND | BNP, 
    CRD | CRP, 
    CJD | CJP, 
    CND | CNP, 
    RRD | RRP, 
    RJD | RJP, 
    RND | RNP
  ]
  /** @deprecated */
  def pipe[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF, ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP](
    doneFilter: Null,
    failFilter: js.Function4[
      /* t */ TJ, 
      /* u */ UJ, 
      /* v */ scala.Nothing, 
      /* repeated */ scala.Nothing, 
      (PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF]) | Thenable[AJF] | AJF
    ],
    progressFilter: js.Function4[
      /* t */ TN, 
      /* u */ UN, 
      /* v */ scala.Nothing, 
      /* repeated */ scala.Nothing, 
      (PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP]) | Thenable[ANP] | ANP
    ]
  ): PromiseBase[
    ARF | ARP, 
    AJF | AJP, 
    ANF | ANP, 
    BRF | BRP, 
    BJF | BJP, 
    BNF | BNP, 
    CRF | CRP, 
    CJF | CJP, 
    CNF | CNP, 
    RRF | RRP, 
    RJF | RJP, 
    RNF | RNP
  ]
  /** @deprecated */
  def pipe[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND, ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF, ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP](
    doneFilter: js.Function4[
      /* t */ TR, 
      /* u */ UR, 
      /* v */ scala.Nothing, 
      /* repeated */ scala.Nothing, 
      (PromiseBase[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND]) | Thenable[ARD] | ARD
    ],
    failFilter: js.Function4[
      /* t */ TJ, 
      /* u */ UJ, 
      /* v */ scala.Nothing, 
      /* repeated */ scala.Nothing, 
      (PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF]) | Thenable[AJF] | AJF
    ],
    progressFilter: js.Function4[
      /* t */ TN, 
      /* u */ UN, 
      /* v */ scala.Nothing, 
      /* repeated */ scala.Nothing, 
      (PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP]) | Thenable[ANP] | ANP
    ]
  ): PromiseBase[
    ARD | ARF | ARP, 
    AJD | AJF | AJP, 
    AND | ANF | ANP, 
    BRD | BRF | BRP, 
    BJD | BJF | BJP, 
    BND | BNF | BNP, 
    CRD | CRF | CRP, 
    CJD | CJF | CJP, 
    CND | CNF | CNP, 
    RRD | RRF | RRP, 
    RJD | RJF | RJP, 
    RND | RNF | RNP
  ]
  /** @deprecated */
  @JSName("pipe")
  var pipe_Original: FnCallDoneFilterFailFilterProgressFilter[TR, UR, TJ, UJ, TN, UN]
  
  /** @deprecated */
  def progress(
    progressCallback: TypeOrArray[CallbackBase[TN, UN, scala.Nothing, scala.Nothing]],
    progressCallbacks: (TypeOrArray[CallbackBase[TN, UN, scala.Nothing, scala.Nothing]])*
  ): this.type
  /** @deprecated */
  @JSName("progress")
  var progress_Original: js.Function2[
    /* progressCallback */ TypeOrArray[CallbackBase[TN, UN, scala.Nothing, scala.Nothing]], 
    /* repeated */ TypeOrArray[CallbackBase[TN, UN, scala.Nothing, scala.Nothing]], 
    this.type
  ]
  
  /** @deprecated */
  def promise(): this.type
  /** @deprecated */
  def promise[TTarget /* <: js.Object */](target: TTarget): this.type & TTarget
  /** @deprecated */
  @JSName("promise")
  var promise_Original: FnCallTarget
  
  /** @deprecated */
  def state(): pending | resolved | rejected
  /** @deprecated */
  @JSName("state")
  var state_Original: js.Function0[pending | resolved | rejected]
  
  /** @deprecated */
  def `then`[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP](): PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP]
  /** @deprecated */
  def `then`[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND](
    doneFilter: js.Function4[
      /* t */ TR, 
      /* u */ UR, 
      /* v */ scala.Nothing, 
      /* repeated */ scala.Nothing, 
      (PromiseBase[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND]) | Thenable[ARD] | ARD
    ]
  ): PromiseBase[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND]
  /** @deprecated */
  def `then`[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF](
    doneFilter: Null,
    failFilter: js.Function4[
      /* t */ TJ, 
      /* u */ UJ, 
      /* v */ scala.Nothing, 
      /* repeated */ scala.Nothing, 
      (PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF]) | Thenable[ARF] | ARF
    ]
  ): PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF]
  /** @deprecated */
  def `then`[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP](
    doneFilter: Null,
    failFilter: Null,
    progressFilter: js.Function4[
      /* t */ TN, 
      /* u */ UN, 
      /* v */ scala.Nothing, 
      /* repeated */ scala.Nothing, 
      (PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP]) | Thenable[ANP] | ANP
    ]
  ): PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP]
  /** @deprecated */
  def `then`[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND, ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF](
    doneFilter: js.Function4[
      /* t */ TR, 
      /* u */ UR, 
      /* v */ scala.Nothing, 
      /* repeated */ scala.Nothing, 
      (PromiseBase[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND]) | Thenable[ARD] | ARD
    ],
    failFilter: js.Function4[
      /* t */ TJ, 
      /* u */ UJ, 
      /* v */ scala.Nothing, 
      /* repeated */ scala.Nothing, 
      (PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF]) | Thenable[ARF] | ARF
    ]
  ): PromiseBase[
    ARD | ARF, 
    AJD | AJF, 
    AND | ANF, 
    BRD | BRF, 
    BJD | BJF, 
    BND | BNF, 
    CRD | CRF, 
    CJD | CJF, 
    CND | CNF, 
    RRD | RRF, 
    RJD | RJF, 
    RND | RNF
  ]
  /** @deprecated */
  def `then`[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND, ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP](
    doneFilter: js.Function4[
      /* t */ TR, 
      /* u */ UR, 
      /* v */ scala.Nothing, 
      /* repeated */ scala.Nothing, 
      (PromiseBase[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND]) | Thenable[ARD] | ARD
    ],
    failFilter: Null,
    progressFilter: js.Function4[
      /* t */ TN, 
      /* u */ UN, 
      /* v */ scala.Nothing, 
      /* repeated */ scala.Nothing, 
      (PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP]) | Thenable[ANP] | ANP
    ]
  ): PromiseBase[
    ARD | ARP, 
    AJD | AJP, 
    AND | ANP, 
    BRD | BRP, 
    BJD | BJP, 
    BND | BNP, 
    CRD | CRP, 
    CJD | CJP, 
    CND | CNP, 
    RRD | RRP, 
    RJD | RJP, 
    RND | RNP
  ]
  /** @deprecated */
  def `then`[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF, ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP](
    doneFilter: Null,
    failFilter: js.Function4[
      /* t */ TJ, 
      /* u */ UJ, 
      /* v */ scala.Nothing, 
      /* repeated */ scala.Nothing, 
      (PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF]) | Thenable[ARF] | ARF
    ],
    progressFilter: js.Function4[
      /* t */ TN, 
      /* u */ UN, 
      /* v */ scala.Nothing, 
      /* repeated */ scala.Nothing, 
      (PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP]) | Thenable[ANP] | ANP
    ]
  ): PromiseBase[
    ARF | ARP, 
    AJF | AJP, 
    ANF | ANP, 
    BRF | BRP, 
    BJF | BJP, 
    BNF | BNP, 
    CRF | CRP, 
    CJF | CJP, 
    CNF | CNP, 
    RRF | RRP, 
    RJF | RJP, 
    RNF | RNP
  ]
  /** @deprecated */
  def `then`[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND, ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF, ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP](
    doneFilter: js.Function4[
      /* t */ TR, 
      /* u */ UR, 
      /* v */ scala.Nothing, 
      /* repeated */ scala.Nothing, 
      (PromiseBase[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND]) | Thenable[ARD] | ARD
    ],
    failFilter: js.Function4[
      /* t */ TJ, 
      /* u */ UJ, 
      /* v */ scala.Nothing, 
      /* repeated */ scala.Nothing, 
      (PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF]) | Thenable[ARF] | ARF
    ],
    progressFilter: js.Function4[
      /* t */ TN, 
      /* u */ UN, 
      /* v */ scala.Nothing, 
      /* repeated */ scala.Nothing, 
      (PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP]) | Thenable[ANP] | ANP
    ]
  ): PromiseBase[
    ARD | ARF | ARP, 
    AJD | AJF | AJP, 
    AND | ANF | ANP, 
    BRD | BRF | BRP, 
    BJD | BJF | BJP, 
    BND | BNF | BNP, 
    CRD | CRF | CRP, 
    CJD | CJF | CJP, 
    CND | CNF | CNP, 
    RRD | RRF | RRP, 
    RJD | RJF | RJP, 
    RND | RNF | RNP
  ]
  /** @deprecated */
  @JSName("then")
  var then_Original: Fn0[TR, UR, TJ, UJ, TN, UN]
}
object DeprecatedPromise {
  
  inline def apply[TR, TJ, TN, UR, UJ, UN](
    always: (/* alwaysCallback */ TypeOrArray[CallbackBase[TR | TJ, UR | UJ, scala.Nothing, scala.Nothing]], /* repeated */ TypeOrArray[CallbackBase[TR | TJ, UR | UJ, scala.Nothing, scala.Nothing]]) => DeprecatedPromise[TR, TJ, TN, UR, UJ, UN],
    `catch`: FnCall[TJ, UJ],
    done: (/* doneCallback */ TypeOrArray[CallbackBase[TR, UR, scala.Nothing, scala.Nothing]], /* repeated */ TypeOrArray[CallbackBase[TR, UR, scala.Nothing, scala.Nothing]]) => DeprecatedPromise[TR, TJ, TN, UR, UJ, UN],
    fail: (/* failCallback */ TypeOrArray[CallbackBase[TJ, UJ, scala.Nothing, scala.Nothing]], /* repeated */ TypeOrArray[CallbackBase[TJ, UJ, scala.Nothing, scala.Nothing]]) => DeprecatedPromise[TR, TJ, TN, UR, UJ, UN],
    pipe: FnCallDoneFilterFailFilterProgressFilter[TR, UR, TJ, UJ, TN, UN],
    progress: (/* progressCallback */ TypeOrArray[CallbackBase[TN, UN, scala.Nothing, scala.Nothing]], /* repeated */ TypeOrArray[CallbackBase[TN, UN, scala.Nothing, scala.Nothing]]) => DeprecatedPromise[TR, TJ, TN, UR, UJ, UN],
    promise: FnCallTarget,
    state: () => pending | resolved | rejected,
    `then`: Fn0[TR, UR, TJ, UJ, TN, UN]
  ): DeprecatedPromise[TR, TJ, TN, UR, UJ, UN] = {
    val __obj = js.Dynamic.literal(always = js.Any.fromFunction2(always), done = js.Any.fromFunction2(done), fail = js.Any.fromFunction2(fail), pipe = pipe.asInstanceOf[js.Any], progress = js.Any.fromFunction2(progress), promise = promise.asInstanceOf[js.Any], state = js.Any.fromFunction0(state))
    __obj.updateDynamic("catch")(`catch`.asInstanceOf[js.Any])
    __obj.updateDynamic("then")(`then`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeprecatedPromise[TR, TJ, TN, UR, UJ, UN]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeprecatedPromise[?, ?, ?, ?, ?, ?], TR, TJ, TN, UR, UJ, UN] (val x: Self & (DeprecatedPromise[TR, TJ, TN, UR, UJ, UN])) extends AnyVal {
    
    inline def setAlways(
      value: (/* alwaysCallback */ TypeOrArray[CallbackBase[TR | TJ, UR | UJ, scala.Nothing, scala.Nothing]], /* repeated */ TypeOrArray[CallbackBase[TR | TJ, UR | UJ, scala.Nothing, scala.Nothing]]) => DeprecatedPromise[TR, TJ, TN, UR, UJ, UN]
    ): Self = StObject.set(x, "always", js.Any.fromFunction2(value))
    
    inline def setCatch(value: FnCall[TJ, UJ]): Self = StObject.set(x, "catch", value.asInstanceOf[js.Any])
    
    inline def setDone(
      value: (/* doneCallback */ TypeOrArray[CallbackBase[TR, UR, scala.Nothing, scala.Nothing]], /* repeated */ TypeOrArray[CallbackBase[TR, UR, scala.Nothing, scala.Nothing]]) => DeprecatedPromise[TR, TJ, TN, UR, UJ, UN]
    ): Self = StObject.set(x, "done", js.Any.fromFunction2(value))
    
    inline def setFail(
      value: (/* failCallback */ TypeOrArray[CallbackBase[TJ, UJ, scala.Nothing, scala.Nothing]], /* repeated */ TypeOrArray[CallbackBase[TJ, UJ, scala.Nothing, scala.Nothing]]) => DeprecatedPromise[TR, TJ, TN, UR, UJ, UN]
    ): Self = StObject.set(x, "fail", js.Any.fromFunction2(value))
    
    inline def setPipe(value: FnCallDoneFilterFailFilterProgressFilter[TR, UR, TJ, UJ, TN, UN]): Self = StObject.set(x, "pipe", value.asInstanceOf[js.Any])
    
    inline def setProgress(
      value: (/* progressCallback */ TypeOrArray[CallbackBase[TN, UN, scala.Nothing, scala.Nothing]], /* repeated */ TypeOrArray[CallbackBase[TN, UN, scala.Nothing, scala.Nothing]]) => DeprecatedPromise[TR, TJ, TN, UR, UJ, UN]
    ): Self = StObject.set(x, "progress", js.Any.fromFunction2(value))
    
    inline def setPromise(value: FnCallTarget): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    
    inline def setState(value: () => pending | resolved | rejected): Self = StObject.set(x, "state", js.Any.fromFunction0(value))
    
    inline def setThen(value: Fn0[TR, UR, TJ, UJ, TN, UN]): Self = StObject.set(x, "then", value.asInstanceOf[js.Any])
  }
}
