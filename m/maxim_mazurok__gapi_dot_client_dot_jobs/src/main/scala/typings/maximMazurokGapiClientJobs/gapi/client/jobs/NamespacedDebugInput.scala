package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamespacedDebugInput extends StObject {
  
  /** Set of experiment names to be absolutely forced. These experiments will be forced without evaluating the conditions. */
  var absolutelyForcedExpNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Set of experiment tags to be absolutely forced. The experiments with these tags will be forced without evaluating the conditions. */
  var absolutelyForcedExpTags: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Set of experiment ids to be absolutely forced. These ids will be forced without evaluating the conditions. */
  var absolutelyForcedExps: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** Set of experiment names to be conditionally forced. These experiments will be forced only if their conditions and their parent domain's conditions are true. */
  var conditionallyForcedExpNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Set of experiment tags to be conditionally forced. The experiments with these tags will be forced only if their conditions and their parent domain's conditions are true. */
  var conditionallyForcedExpTags: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Set of experiment ids to be conditionally forced. These ids will be forced only if their conditions and their parent domain's conditions are true. */
  var conditionallyForcedExps: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * If true, disable automatic enrollment selection (at all diversion points). Automatic enrollment selection means experiment selection process based on the experiment's automatic
    * enrollment condition. This does not disable selection of forced experiments.
    */
  var disableAutomaticEnrollmentSelection: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set of experiment names to be disabled. If an experiment is disabled, it is never selected nor forced. If an aggregate experiment is disabled, its partitions are disabled together.
    * If an experiment with an enrollment is disabled, the enrollment is disabled together. If a name corresponds to a domain, the domain itself and all descendant experiments and domains
    * are disabled together.
    */
  var disableExpNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Set of experiment tags to be disabled. All experiments that are tagged with one or more of these tags are disabled. If an experiment is disabled, it is never selected nor forced. If
    * an aggregate experiment is disabled, its partitions are disabled together. If an experiment with an enrollment is disabled, the enrollment is disabled together.
    */
  var disableExpTags: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Set of experiment ids to be disabled. If an experiment is disabled, it is never selected nor forced. If an aggregate experiment is disabled, its partitions are disabled together. If
    * an experiment with an enrollment is disabled, the enrollment is disabled together. If an ID corresponds to a domain, the domain itself and all descendant experiments and domains are
    * disabled together.
    */
  var disableExps: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * If true, disable manual enrollment selection (at all diversion points). Manual enrollment selection means experiment selection process based on the request's manual enrollment
    * states (a.k.a. opt-in experiments). This does not disable selection of forced experiments.
    */
  var disableManualEnrollmentSelection: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, disable organic experiment selection (at all diversion points). Organic selection means experiment selection process based on traffic allocation and diversion condition
    * evaluation. This does not disable selection of forced experiments. This is useful in cases when it is not known whether experiment selection behavior is responsible for a error or
    * breakage. Disabling organic selection may help to isolate the cause of a given problem.
    */
  var disableOrganicSelection: js.UndefOr[Boolean] = js.undefined
  
  /** Flags to force in a particular experiment state. Map from flag name to flag value. */
  var forcedFlags: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientJobs.maximMazurokGapiClientJobsStrings.NamespacedDebugInput & TopLevel[js.Any]
  ] = js.undefined
  
  /** Rollouts to force in a particular experiment state. Map from rollout name to rollout value. */
  var forcedRollouts: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: boolean}
    */ typings.maximMazurokGapiClientJobs.maximMazurokGapiClientJobsStrings.NamespacedDebugInput & TopLevel[js.Any]
  ] = js.undefined
}
object NamespacedDebugInput {
  
  inline def apply(): NamespacedDebugInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamespacedDebugInput]
  }
  
  extension [Self <: NamespacedDebugInput](x: Self) {
    
    inline def setAbsolutelyForcedExpNames(value: js.Array[String]): Self = StObject.set(x, "absolutelyForcedExpNames", value.asInstanceOf[js.Any])
    
    inline def setAbsolutelyForcedExpNamesUndefined: Self = StObject.set(x, "absolutelyForcedExpNames", js.undefined)
    
    inline def setAbsolutelyForcedExpNamesVarargs(value: String*): Self = StObject.set(x, "absolutelyForcedExpNames", js.Array(value :_*))
    
    inline def setAbsolutelyForcedExpTags(value: js.Array[String]): Self = StObject.set(x, "absolutelyForcedExpTags", value.asInstanceOf[js.Any])
    
    inline def setAbsolutelyForcedExpTagsUndefined: Self = StObject.set(x, "absolutelyForcedExpTags", js.undefined)
    
    inline def setAbsolutelyForcedExpTagsVarargs(value: String*): Self = StObject.set(x, "absolutelyForcedExpTags", js.Array(value :_*))
    
    inline def setAbsolutelyForcedExps(value: js.Array[Double]): Self = StObject.set(x, "absolutelyForcedExps", value.asInstanceOf[js.Any])
    
    inline def setAbsolutelyForcedExpsUndefined: Self = StObject.set(x, "absolutelyForcedExps", js.undefined)
    
    inline def setAbsolutelyForcedExpsVarargs(value: Double*): Self = StObject.set(x, "absolutelyForcedExps", js.Array(value :_*))
    
    inline def setConditionallyForcedExpNames(value: js.Array[String]): Self = StObject.set(x, "conditionallyForcedExpNames", value.asInstanceOf[js.Any])
    
    inline def setConditionallyForcedExpNamesUndefined: Self = StObject.set(x, "conditionallyForcedExpNames", js.undefined)
    
    inline def setConditionallyForcedExpNamesVarargs(value: String*): Self = StObject.set(x, "conditionallyForcedExpNames", js.Array(value :_*))
    
    inline def setConditionallyForcedExpTags(value: js.Array[String]): Self = StObject.set(x, "conditionallyForcedExpTags", value.asInstanceOf[js.Any])
    
    inline def setConditionallyForcedExpTagsUndefined: Self = StObject.set(x, "conditionallyForcedExpTags", js.undefined)
    
    inline def setConditionallyForcedExpTagsVarargs(value: String*): Self = StObject.set(x, "conditionallyForcedExpTags", js.Array(value :_*))
    
    inline def setConditionallyForcedExps(value: js.Array[Double]): Self = StObject.set(x, "conditionallyForcedExps", value.asInstanceOf[js.Any])
    
    inline def setConditionallyForcedExpsUndefined: Self = StObject.set(x, "conditionallyForcedExps", js.undefined)
    
    inline def setConditionallyForcedExpsVarargs(value: Double*): Self = StObject.set(x, "conditionallyForcedExps", js.Array(value :_*))
    
    inline def setDisableAutomaticEnrollmentSelection(value: Boolean): Self = StObject.set(x, "disableAutomaticEnrollmentSelection", value.asInstanceOf[js.Any])
    
    inline def setDisableAutomaticEnrollmentSelectionUndefined: Self = StObject.set(x, "disableAutomaticEnrollmentSelection", js.undefined)
    
    inline def setDisableExpNames(value: js.Array[String]): Self = StObject.set(x, "disableExpNames", value.asInstanceOf[js.Any])
    
    inline def setDisableExpNamesUndefined: Self = StObject.set(x, "disableExpNames", js.undefined)
    
    inline def setDisableExpNamesVarargs(value: String*): Self = StObject.set(x, "disableExpNames", js.Array(value :_*))
    
    inline def setDisableExpTags(value: js.Array[String]): Self = StObject.set(x, "disableExpTags", value.asInstanceOf[js.Any])
    
    inline def setDisableExpTagsUndefined: Self = StObject.set(x, "disableExpTags", js.undefined)
    
    inline def setDisableExpTagsVarargs(value: String*): Self = StObject.set(x, "disableExpTags", js.Array(value :_*))
    
    inline def setDisableExps(value: js.Array[Double]): Self = StObject.set(x, "disableExps", value.asInstanceOf[js.Any])
    
    inline def setDisableExpsUndefined: Self = StObject.set(x, "disableExps", js.undefined)
    
    inline def setDisableExpsVarargs(value: Double*): Self = StObject.set(x, "disableExps", js.Array(value :_*))
    
    inline def setDisableManualEnrollmentSelection(value: Boolean): Self = StObject.set(x, "disableManualEnrollmentSelection", value.asInstanceOf[js.Any])
    
    inline def setDisableManualEnrollmentSelectionUndefined: Self = StObject.set(x, "disableManualEnrollmentSelection", js.undefined)
    
    inline def setDisableOrganicSelection(value: Boolean): Self = StObject.set(x, "disableOrganicSelection", value.asInstanceOf[js.Any])
    
    inline def setDisableOrganicSelectionUndefined: Self = StObject.set(x, "disableOrganicSelection", js.undefined)
    
    inline def setForcedFlags(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientJobs.maximMazurokGapiClientJobsStrings.NamespacedDebugInput & TopLevel[js.Any]
    ): Self = StObject.set(x, "forcedFlags", value.asInstanceOf[js.Any])
    
    inline def setForcedFlagsUndefined: Self = StObject.set(x, "forcedFlags", js.undefined)
    
    inline def setForcedRollouts(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: boolean}
      */ typings.maximMazurokGapiClientJobs.maximMazurokGapiClientJobsStrings.NamespacedDebugInput & TopLevel[js.Any]
    ): Self = StObject.set(x, "forcedRollouts", value.asInstanceOf[js.Any])
    
    inline def setForcedRolloutsUndefined: Self = StObject.set(x, "forcedRollouts", js.undefined)
  }
}
